import java.util.*;
import java.io.*;

public class Translator {
	
	private File output;
	private ArrayList<String> instructions;
	private ArrayList<String> initInstructions;
	private ArrayList<String> dataInstructions;
	private ArrayList<String> schedInstructions;
	private int labelCounter;
	private Stack<Integer> labels;
	
	public Translator() {
		instructions = new ArrayList<String>();
		initInstructions = new ArrayList<String>();
		dataInstructions = new ArrayList<String>();
		schedInstructions = new ArrayList<String>();
		labels = new Stack<Integer>();
		labelCounter = 0;
		output = new File("out.asm");
		try {
			output.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void makeOutput() {
		try {
			PrintWriter writer = new PrintWriter(output);
			writer.println(".data");
			for (int i = 0; i < dataInstructions.size(); i++) {
				writer.println(dataInstructions.get(i));
			}
			writer.println(".text");
			writer.println("main:");
			writer.println("move $fp, $sp");
			writer.println("move $t7, $fp");
			writer.println("addi $t7, $t7, -32768");
			for (int i = 0; i < initInstructions.size(); i++) {
				writer.println(initInstructions.get(i));
			}
			for (int i = 0; i < schedInstructions.size(); i++) {
				writer.println(schedInstructions.get(i));
			}
			instructions.add("HALT:"); // halt
			this.addSystemCall(10);
			for (int i = 0; i < instructions.size(); i++) {
				writer.println(instructions.get(i));
			}

			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addStringToStack(String s) {
		for (int i = 0; i < s.length(); i++) {
			this.addVariableToStack(s.charAt(i), 1);
		}
	}
	
	public void addVariableToStack(int x, int size) {
		instructions.add("#### addVariableToStack -- adding a number to stack");
		for (int i = 0; i < size; i++) {
			instructions.add("li $a0, " + x);
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		}
		instructions.add("#### addVariableToStack -- end of adding a number to stack");
		
	}
	
	public void addVariableToStack(String s, int adr, int size) {
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
	
	public void popStack(int size) {
		instructions.add("# pop stack");
		instructions.add("addiu $sp, $sp, " + size);
		instructions.add("# end of pop stack");
	}
	
	public void addSystemCall(int x) {
		instructions.add("# start syscall " + x);
		instructions.add("li $v0, " + x);
		instructions.add("syscall");
		instructions.add("# end syscall");
	}
	
	public void assignCommand(boolean def, int size) {
		instructions.add("# start of assign");
		for (int i = 0; i < size; i++) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, " + 4 * size + "($sp)");
			//popStack();
			instructions.add("sw $a0, 0($a1)");
			instructions.add("sw $a0, " + 4 * size + "($sp)");
		}
		// writeOne(CharType.getInstance(), 1);
		
		// instructions.add("sw $a0, 0($sp)");
		// instructions.add("addiu $sp, $sp, -4");
		if (!def)
		popStack(size * 4);
		instructions.add("# end of assign");
	}
	
	public void operationCommand(String s) {
		instructions.add("# operation " + s);
		if (s.equals("*")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("mul $a0, $a0, $a1");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("/")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("div $a0, $a1, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("+")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("add $a0, $a0, $a1");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("-")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("sub $a0, $a1, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("not")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("not $a0, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("neg")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("neg $a0, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("<")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("slt $a0, $a0, $a1");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals(">")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("slt $a0, $a1, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("<>")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("sub $a0, $a1, $a0");
			instructions.add("not $a0, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("==")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("sub $a0, $a1, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("or")) {
			instructions.add("lw $a0, 4($sp)");
			popStack();
			instructions.add("lw $a1, 4($sp)");
			popStack();
			instructions.add("or $a0, $a1, $a0");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addiu $sp, $sp, -4");
		} else if (s.equals("and")) {
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
		instructions.add("lw $a0, " + 4 * offset + "($sp)");
		if (type.equals(CharType.getInstance()))
		this.addSystemCall(11);
		else
		this.addSystemCall(1);
		// popStack();
		instructions.add("# end writeone");
	}
	
	public void write(Type type) {
		instructions.add("# writing");
		int size = type.len();
		
		if (type.toString().equals("array(char)")) {
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
	
	public void addGlobalToStack(int adr, int size) {
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
	
	public void addGlobalVariable(int adr, int x) {
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
	
	public void foreachStatement(String startLabel, String endLabel, int size) {
		instructions.add("# foreach");
		putLabel(startLabel);
		instructions.add("lw $a3, 4($sp)"); // a3 = len - index
		// condition
		instructions.add("beqz $a3, " + endLabel);
		
		// push element
		instructions.add("li $a2, 4");
		instructions.add("mul $a3, $a3, $a2");
		instructions.add("addu $a3, $a3, $sp");
		instructions.add("lw $a3, 4($a3)");
		instructions.add("sw $a3, " + (size + 2) * 4 + "($sp)");
		// instructions.add("addiu $sp, $sp, -4");
		
		instructions.add("# end foreach");
	}
	
	public void decForeachIndex() {
		instructions.add("lw $a3, 4($sp)"); // a0 = len - index
		instructions.add("addiu $a3, $a3, -1");
		popStack();
		instructions.add("sw $a3, 0($sp)");
		instructions.add("addiu $sp, $sp, -4");
	}
	
	public void actorStart(String actorName, int queueLen) {
		// putLabel(actorName);
		dataInstructions.add(actorName + ": .space " + ((1 + 1 + queueLen * 2) * 4));
		initInstructions.add("#--- PCB: " + actorName);
		initInstructions.add("la $a0, " + actorName);
		initInstructions.add("li $a1, 0");
		initInstructions.add("sw $a1, 0($a0)");
		initInstructions.add("sw $a1, 4($a0)");
		
		initInstructions.add("la $a1, scheduler");
		initInstructions.add("lw $a2 ,0($a1)"); // a2 = counter
		
		initInstructions.add("li $a3, 4");
		initInstructions.add("mul $a3, $a2, $a3");
		initInstructions.add("add $a3, $a3, $a1");
		initInstructions.add("sw $a0, 4($a3)");
		
		initInstructions.add("addi $a2, $a2, 1");
		initInstructions.add("sw $a2, 0($a1)");
	}
	public void addMessageToActorQueue(String actorName, String receiverLabel, SymbolTableReceiverItem receiverItem) {
		instructions.add("# " + actorName + " << " + receiverLabel);
		instructions.add("la $a0," + actorName); //a0 = sare PCB
		instructions.add("la $a1," + receiverLabel); // sare receiver
		
		instructions.add("li $a3, 4");
		instructions.add("lw $a2, 0($a0)"); //a2 = rear
		
		instructions.add("mul $a2, $a2, $a3");
		instructions.add("add $a2, $a0, $a2");
		
		instructions.add("sw $a1, 8($a2)"); // addresse receivero rikhtim
		
		instructions.add("sw $t7, 12($a2)"); // addresse avvale parametera
		
		instructions.add("addi $a2, $a2, 1");
		instructions.add("sw $a2, 0($a0)");
		
		addReceiverParamsToDataSegment(receiverItem.getTypes());
	}
	public void addMessageToActorQueue(String actorName, String receiverLabel) {
		initInstructions.add("# " + actorName + " << " + receiverLabel);
		initInstructions.add("la $a0," + actorName); //a0 = sare PCB
		initInstructions.add("la $a1," + receiverLabel); // sare receiver
		
		initInstructions.add("li $a3, 4");
		initInstructions.add("lw $a2, 0($a0)"); //a2 = rear
		initInstructions.add("mul $a3, $a2, $a3");
		initInstructions.add("add $a3, $a0, $a3");
		
		initInstructions.add("sw $a1, 8($a3)"); // addresse receivero rikhtim
		initInstructions.add("sw $t7, 12($a3)"); // addresse avvale parametera
		
		// update rear
		initInstructions.add("addi $a2, $a2, 1");
		initInstructions.add("sw $a2, 0($a0)");

		initInstructions.add("addi $s0, $s0, 1");
	}
	/* public void addInitToActorQueue(String actorName, String receiverLabel) {
		instructions.add("# " + actorName + " << " + receiverLabel);
		initInstructions.add("la $a0, " + actorName); //a0 = sare PCB
		initInstructions.add("la $a1, " + receiverLabel); // sare receiver
		
		initInstructions.add("li $a3, 4");
		initInstructions.add("lw $a2, 0($a0)"); //a2 = queue rare counter
		initInstructions.add("mul $a3, $a2, $a3");
		initInstructions.add("add $a3, $a0, $a3");
		
		initInstructions.add("sw $a1, 8($a3)"); // addresse receivero rikhtim
		initInstructions.add("sw $t7, 12($a3)"); // addresse avvale parametera
		
		initInstructions.add("addi $a2, $a2, 1");
		initInstructions.add("sw $a2, 0($a0)");
	} */
	public void addReceiverParamsToDataSegment(ArrayList<Type> params) {
		instructions.add("# Adding Receiver params to data segment");
		int size = 1;
		for (Type type : params) {
			size *= type.size();
		}
		int offset = size * 4;
		instructions.add("addi $sp, $sp, " + offset);
		for (int i = 0; i < size; i++) {
			instructions.add("lw $a0, 0($sp)");
			instructions.add("sw $a0, 0($t7)");
			instructions.add("addi $t7, $t7, -4");
			instructions.add("addi $sp, $sp, -4");
		}
		instructions.add("addi $sp, $sp, " + (offset + 4));
	}
	
	public void scheduler() {
		dataInstructions.add("scheduler: .space  200");
		initInstructions.add("# Init Scheduler");
		initInstructions.add("li $a0, 0");
		initInstructions.add("la $a1, scheduler");
		initInstructions.add("sw $a0, 0($a1)");
		initInstructions.add("li $t6, 0");
		initInstructions.add("li $s0, 0");
		
		schedInstructions.add("# ___SCHEDULER");
		schedInstructions.add("schedulerCode: ");
		schedInstructions.add("la $a0, scheduler");
		schedInstructions.add("lw $a1, 0($a0)"); // a1 = scheduler space counter 
		
		schedInstructions.add("rem $t6, $t6, $a1"); // t6 = t6 % a1
		schedInstructions.add("li $a2, 4");
		schedInstructions.add("mul $a2, $t6, $a2");
		schedInstructions.add("add $a2, $a2, $a0");
		schedInstructions.add("lw $a3, 4($a2)");
		//$a3 = address of actor label 
		schedInstructions.add("lw $t0, 0($a3)");
		schedInstructions.add("lw $t1, 4($a3)");
		
		schedInstructions.add("beq $t1, $t0, ___ACTOR_HAS_NO_MESSAGE");
		schedInstructions.add("li $a2, 4");
		schedInstructions.add("mul $a2, $t1, $a2");
		schedInstructions.add("add $a2, $a2, $a3");
		// $t3 = message to run

		// update queue front
		schedInstructions.add("addi $t1, $t1, 1");
		schedInstructions.add("sw, $t1, 4($a3)");

		schedInstructions.add("addi $s0, $s0, -1");

		schedInstructions.add("lw $t3, 8($a2)");
		schedInstructions.add("lw $t5, 12($a2)"); // t5 = params are in 0($t5)

		schedInstructions.add("jalr $t3");
		schedInstructions.add("___ACTOR_HAS_NO_MESSAGE:");
		schedInstructions.add("beqz $s0, HALT");
		schedInstructions.add("addi $t6, $t6, 1");
		schedInstructions.add("j schedulerCode");
	}
	
	public void receiverStart(String label) {
		putLabel(label);
	}
	public void getParamsFromDataSegment(int count){
		for (int i = 0;i < count; i++){
			instructions.add("lw $a0, 0($t5)");
			instructions.add("sw $a0, 0($sp)");
			instructions.add("addi $sp, $sp, -4");
			instructions.add("addi $t5, $t5, 4");
		}
	}
	public void endReceiver() {
		instructions.add("jr $ra");
	}
}
