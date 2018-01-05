main:
move $fp, $sp
#### addVariableToStack -- adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
beqz $a0, LABEL____________________0
#### addVariableToStack -- adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
beqz $a0, LABEL____________________1
#### addVariableToStack -- adding a number to stack
li $a0, 5
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
j ATALKLABEL1
LABEL____________________1:
# pop stack
addiu $sp, $sp, 0
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
beqz $a0, LABEL____________________3
#### addVariableToStack -- adding a number to stack
li $a0, 4
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
j ATALKLABEL2
LABEL____________________3:
# pop stack
addiu $sp, $sp, 0
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 97
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 109
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 109
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 97
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 109
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 20
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# pop stack
addiu $sp, $sp, 0
# end of pop stack
LABEL____________________4:
ATALKLABEL2:
#### addVariableToStack -- adding a number to stack
li $a0, 6
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
#### addVariableToStack -- adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
beqz $a0, LABEL____________________5
#### addVariableToStack -- adding a number to stack
li $a0, 7
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
#### addVariableToStack -- adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
beqz $a0, LABEL____________________6
#### addVariableToStack -- adding a number to stack
li $a0, 8
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# pop stack
addiu $sp, $sp, 0
# end of pop stack
LABEL____________________6:
ATALKLABEL4:
# pop stack
addiu $sp, $sp, 0
# end of pop stack
LABEL____________________5:
ATALKLABEL3:
# pop stack
addiu $sp, $sp, 0
# end of pop stack
LABEL____________________2:
ATALKLABEL1:
j ATALKLABEL0
LABEL____________________0:
# pop stack
addiu $sp, $sp, 0
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
beqz $a0, LABEL____________________7
#### addVariableToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
j ATALKLABEL0
LABEL____________________7:
# pop stack
addiu $sp, $sp, 0
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# pop stack
addiu $sp, $sp, 0
# end of pop stack
LABEL____________________8:
ATALKLABEL0:
#### addVariableToStack -- adding a number to stack
li $a0, 102
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 105
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 110
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 105
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 115
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 104
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 24($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 20($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 16($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 12($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 8($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# pop stack
addiu $sp, $sp, 24
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# pop stack
addiu $sp, $sp, 0
# end of pop stack
# pop stack
addiu $sp, $sp, 0
# end of pop stack
# pop stack
addiu $sp, $sp, 0
# end of pop stack
# start syscall 10
li $v0, 10
syscall
# end syscall
