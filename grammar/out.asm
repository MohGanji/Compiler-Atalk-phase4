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
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 20
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -12
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -16
sw $a0, 0($sp)
addiu $sp, $sp, -4
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
li $a0, 97
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 32
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 98
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 32
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
lw $a1, 20($sp)
sw $a0, 0($a1)
sw $a0, 20($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 20($sp)
sw $a0, 0($a1)
sw $a0, 20($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 20($sp)
sw $a0, 0($a1)
sw $a0, 20($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 20($sp)
sw $a0, 0($a1)
sw $a0, 20($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 20($sp)
sw $a0, 0($a1)
sw $a0, 20($sp)
# end of assign
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
li $a0, 9
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 52
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 51
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 64
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 35
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 36
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 37
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 38
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 99
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# writing
# writeone
lw $a0, 44($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 40($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 36($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 32($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
# writeone
lw $a0, 28($sp)
# start syscall 11
li $v0, 11
syscall
# end syscall
# end writeone
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
addiu $sp, $sp, 44
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# start of adding variable to stack
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -16($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -20($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -24($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -28($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
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
addiu $sp, $sp, 32
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
