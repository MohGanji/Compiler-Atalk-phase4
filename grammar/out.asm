main:
move $fp, $sp
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 8
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -4
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -8
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addVariableToStack -- adding a number to stack
li $a0, 97
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 98
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# start of assign
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 8($sp)
sw $a0, 0($a1)
sw $a0, 8($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 8($sp)
sw $a0, 0($a1)
sw $a0, 8($sp)
# end of assign
# start of adding variable to stack
lw $a0, -4($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
#### addVariableToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# foreach
FOREACH_START_________________0:
lw $a3, 4($sp)
beqz $a3, FOREACH_END_________________1
li $a2, 4
mul $a3, $a3, $a2
addu $a3, $a3, $sp
lw $a3, 4($a3)
sw $a3, 0($sp)
addiu $sp, $sp, -4
# end foreach
#### addVariableToStack -- adding a number to stack
li $a0, 103
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
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a3, 4($sp)
addiu $a3, $a3, -1
# pop stack
addiu $sp, $sp, 4
# end of pop stack
sw $a3, 0($sp)
addiu $sp, $sp, -4
j FOREACH_START_________________0
FOREACH_END_________________1:
# pop stack
addiu $sp, $sp, 12
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 16
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
