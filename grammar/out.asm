main:
move $fp, $sp
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addVariableToStack -- adding a number to stack
li $a0, 102
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# start of assign
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
sw $a0, 0($a1)
sw $a0, 4($sp)
# end of assign
# start of adding variable to stack
lw $a0, 0($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
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
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -4
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addVariableToStack -- adding a number to stack
li $a0, 4
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# start of assign
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
sw $a0, 0($a1)
sw $a0, 4($sp)
# end of assign
# start of adding variable to stack
lw $a0, -4($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
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
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -8
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -12
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -16
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addVariableToStack -- adding a number to stack
li $a0, 103
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 114
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 114
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# start of assign
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 12($sp)
sw $a0, 0($a1)
sw $a0, 12($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 12($sp)
sw $a0, 0($a1)
sw $a0, 12($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 12($sp)
sw $a0, 0($a1)
sw $a0, 12($sp)
# end of assign
#### addVariableToStack -- adding a number to stack
li $a0, 103
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 114
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 114
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
# writeone
lw $a0, 4($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end writeone
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# pop stack
addiu $sp, $sp, 20
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
