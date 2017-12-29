main:
move $fp, $sp
#### addToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# start of adding address to stack
addiu $a0, $fp, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# start of assign
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
sw $a0, 0($a1)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# end of assign
# start of adding variable to stack
lw $a0, 0($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing
lw $a0, 4($sp)
# start syscall 1
li $v0, 1
syscall
# end syscall
# pop stack
addiu $sp, $sp, 4
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# start syscall 10
li $v0, 10
syscall
# end syscall
