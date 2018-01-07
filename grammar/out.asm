main:
move $fp, $sp
__________ACTOR0:
__________ACTOR0__RECEIVER_0____:
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 12
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
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
#### addVariableToStack -- adding a number to stack
li $a0, 99
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
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# start of adding variable to stack
lw $a0, 0($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -4($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
#### addVariableToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# foreach
FOREACH_START___________0:
lw $a3, 4($sp)
beqz $a3, FOREACH_END_____________1
li $a2, 4
mul $a3, $a3, $a2
addu $a3, $a3, $sp
lw $a3, 4($a3)
sw $a3, 20($sp)
# end foreach
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -16
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addVariableToStack -- adding a number to stack
li $a0, 2
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
lw $a0, -16($fp)
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
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 12
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -20
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -24
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -28
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addVariableToStack -- adding a number to stack
li $a0, 65
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 66
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 67
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
# pop stack
addiu $sp, $sp, 20
# end of pop stack
lw $a3, 4($sp)
addiu $a3, $a3, -1
# pop stack
addiu $sp, $sp, 4
# end of pop stack
sw $a3, 0($sp)
addiu $sp, $sp, -4
j FOREACH_START___________0
FOREACH_END_____________1:
# pop stack
addiu $sp, $sp, 16
# end of pop stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -12
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
lw $a0, -12($fp)
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
