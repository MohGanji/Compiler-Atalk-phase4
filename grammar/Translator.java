import java.util.*;
import java.io.*;

public class Translator {

    private File output;
    private ArrayList <String> instructions;
    private ArrayList <String> initInstructions;
    private int labelCounter;
    private Stack <Integer> labels;

    public Translator(){
        instructions = new ArrayList<String>();
        initInstructions = new ArrayList<String>();
        labels = new Stack<Integer>();
        labelCounter = 0;
        output = new File("out.asm");
        try {
            output.createNewFile();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void makeOutput(){
        this.addSystemCall(10);
        try {
            PrintWriter writer = new PrintWriter(output);
            writer.println("main:");
            writer.println("move $fp, $sp");
            for (int i=0;i<initInstructions.size();i++){
                writer.println(initInstructions.get(i));
            }
            for (int i=0;i<instructions.size();i++){
                writer.println(instructions.get(i));
            }
            writer.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void addStringToStack(String s) {
        for (int i = 0; i < s.length(); i++) {
            this.addVariableToStack(s.charAt(i), 1);
        }
    }

    public void addVariableToStack(int x, int size){
        instructions.add("#### addVariableToStack -- adding a number to stack");
        for (int i = 0; i < size; i++) {
            instructions.add("li $a0, " + x);
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        instructions.add("#### addVariableToStack -- end of adding a number to stack");

    }

    public void addVariableToStack(String s, int adr, int size){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding variable to stack");
        for (int i = 0; i < size; i++) {
            instructions.add("lw $a0, " + adr + "($fp)");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
            adr = adr - 4;
        }
        instructions.add("# end of adding variable to stack");
    }

    public void addVariableAddressToStack(String s, int adr, int size) {
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding address to stack");
        for (int i = 0; i < size; i++) {
            instructions.add("addiu $a0, $fp, " + adr);
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
            adr = adr - 4;
        }
        instructions.add("# end of adding address to stack");
    }

    public void addGlobalVariableAddressToStack(String s, int adr, int size){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global address to stack");
        for (int i = 0; i < size; i++) {
            instructions.add("addiu $a0, $gp, " + adr);
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
            adr = adr - 4;
        }
        instructions.add("# end of adding global address to stack");
    }

    public void popStack(){
        instructions.add("# pop stack");
        instructions.add("addiu $sp, $sp, 4");
        instructions.add("# end of pop stack");
    }

    public void popStack(int size){
        instructions.add("# pop stack");
        instructions.add("addiu $sp, $sp, " + size);
        instructions.add("# end of pop stack");
    }

    public void addSystemCall(int x){
        instructions.add("# start syscall " + x);
        instructions.add("li $v0, " + x);
        instructions.add("syscall");
        instructions.add("# end syscall");
    }

    public void assignCommand(boolean def, int size){
        instructions.add("# start of assign");
        for (int i = 0; i < size; i++) {
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, " + 4*size + "($sp)");
            //popStack();
            instructions.add("sw $a0, 0($a1)");
            instructions.add("sw $a0, " + 4*size + "($sp)");
        }
        // writeOne(CharType.getInstance(), 1);
        

        // instructions.add("sw $a0, 0($sp)");
        // instructions.add("addiu $sp, $sp, -4");
        if (!def)
            popStack(size * 4);
        instructions.add("# end of assign");
    }

    public void operationCommand(String s){
        instructions.add("# operation " + s);
        if (s.equals("*")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("mul $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("/")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("div $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("+")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("add $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("-")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("sub $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("not")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("not $a0, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("neg")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("neg $a0, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("<")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("slt $a0, $a0, $a1");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals(">")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("slt $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("<>")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("sub $a0, $a1, $a0");
            instructions.add("not $a0, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("==")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("sub $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("or")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("or $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        else if (s.equals("and")){
            instructions.add("lw $a0, 4($sp)");
            popStack();
            instructions.add("lw $a1, 4($sp)");
            popStack();
            instructions.add("and $a0, $a1, $a0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        instructions.add("# end of operation " + s);
    }

    public void writeOne(Type type, int offset) {
        instructions.add("# writeone");
        instructions.add("lw $a0, " + 4*offset + "($sp)");
        if (type.equals(CharType.getInstance()))
            this.addSystemCall(11);
        else
            this.addSystemCall(1);
        // popStack();
        instructions.add("# end writeone");
    }

    public void write(Type type){
        instructions.add("# writing");
        int size = 1;

        if (type.toString().equals("array(char)")) {
            size = ((ArrayType) type).len();
            for (int i = 0; i < size; i++) {
                this.writeOne(CharType.getInstance(), size - i);
            }
        } else {
            this.writeOne(type, size);
        }

        popStack(size * 4);

        lineBreak();

        instructions.add("# end of writing");
    }

    private void lineBreak() {
        instructions.add("addi $a0, $zero, 10");
        this.addSystemCall(11);
    }

    public void addGlobalToStack(int adr, int size){
//        int adr = table.getAddress(s)*(-1);
        instructions.add("# start of adding global variable to stack");
        for (int i = 0; i < size; i++) {        
            instructions.add("lw $a0, " + adr + "($gp)");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
            adr = adr - 4;
        }
        instructions.add("# end of adding global variable to stack");
    }

    public void addGlobalVariable(int adr, int x){
//        int adr = table.getAddress(s)*(-1);
        initInstructions.add("# adding a global variable");
        initInstructions.add("li $a0, " + x);
        initInstructions.add("sw $a0, " + adr + "($gp)");
        initInstructions.add("# end of adding a global variable");
    }

    public void read(int size) {
        for (int i = 0; i < size; i++) {
            addSystemCall(12);
            instructions.add("addiu $a0, $v0, 0");
            instructions.add("sw $a0, 0($sp)");
            instructions.add("addiu $sp, $sp, -4");
        }
        lineBreak();
    }

    public void ifStatement() {
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("beqz $a0, " + generateLabel());
    }
    public void elseStatement() {
        instructions.add("j " + generateLabel());
    }
    public void putLabel() {
        instructions.add(lastLabel() + ":");
    }
    public void putLabel(String label) {
        instructions.add(label + ":");
    }
    public void jumpLabel(String label) {
        instructions.add("j " + label);
    }

    public String generateLabel() {
        String s = "LABEL____________________" + this.labelCounter;
        this.labels.push(this.labelCounter);
        this.labelCounter += 1;
        return s;
    }
    private String lastLabel() {
        return "LABEL____________________" + this.labels.pop();
    }

    public void accessArray() {
        instructions.add("# access array");
        instructions.add("lw $a0, 4($sp)");
        popStack();
        instructions.add("lw $a1, 4($sp)");
        popStack();
        instructions.add("li $t0, 4");
        instructions.add("mul $a1, $a1, $t0");
        instructions.add("sub $a0, $a0, $a1");
        instructions.add("lw $a0, 0($a0)");
        instructions.add("sw $a0, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
        instructions.add("# end access array");
    }
    public void foreachStatement(String startLabel, String endLabel) {
        instructions.add("# foreach");
        putLabel(startLabel);
        instructions.add("lw $a3, 4($sp)"); // a0 = len - index
        // condition
        instructions.add("beqz $a3, " + endLabel);

        // push element
        instructions.add("li $a2, 4");
        instructions.add("mul $a3, $a3, $a2");
        instructions.add("addu $a3, $a3, $sp");
        instructions.add("lw $a3, 4($a3)");
        instructions.add("sw $a3, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");

        instructions.add("# end foreach");
    }
    public void decForeachIndex() {
        instructions.add("lw $a3, 4($sp)"); // a0 = len - index
        instructions.add("addiu $a3, $a3, -1");
        popStack();
        instructions.add("sw $a3, 0($sp)");
        instructions.add("addiu $sp, $sp, -4");
    }
}
