main:
move $fp, $sp
# start syscall 12
li $v0, 12
syscall
# end syscall
addiu $a0, $v0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# start syscall 12
li $v0, 12
syscall
# end syscall
addiu $a0, $v0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# pop stack
addiu $sp, $sp, 8
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 1
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
addiu $sp, $sp, 0
# end of pop stack
# pop stack
addiu $sp, $sp, 0
# end of pop stack
# start syscall 10
li $v0, 10
syscall
# end syscall
