main:
move $fp, $sp
#### addToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
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
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation >
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
slt $a0, $a1, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation >
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
#### addToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -4
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation <
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
slt $a0, $a0, $a1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation <
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
# end of assign
# start of adding variable to stack
lw $a0, -4($fp)
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
#### addToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -8
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# start of adding variable to stack
lw $a0, 0($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation +
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
add $a0, $a0, $a1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation +
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
# end of assign
# start of adding variable to stack
lw $a0, -8($fp)
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
#### addToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -12
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation *
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
mul $a0, $a0, $a1
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation *
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
# end of assign
# start of adding variable to stack
lw $a0, -12($fp)
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
#### addToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# start of adding address to stack
addiu $a0, $fp, -16
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# start of adding variable to stack
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# start of adding variable to stack
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# operation /
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
div $a0, $a1, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation /
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
# end of assign
# start of adding variable to stack
lw $a0, -16($fp)
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
# start of adding address to stack
addiu $a0, $fp, -8
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation -
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
sub $a0, $a1, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation -
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
lw $a0, -8($fp)
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
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation and
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
and $a0, $a1, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation and
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
# start of adding address to stack
addiu $a0, $fp, -4
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation or
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
or $a0, $a1, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation or
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
lw $a0, -4($fp)
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
# start of adding address to stack
addiu $a0, $fp, -12
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 7
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation not
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
not $a0, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation not
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
lw $a0, -12($fp)
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
# start of adding address to stack
addiu $a0, $fp, -12
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 1
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation not
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
not $a0, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation not
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
lw $a0, -12($fp)
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
# start of adding address to stack
addiu $a0, $fp, -12
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 16
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation not
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
not $a0, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation not
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
lw $a0, -12($fp)
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
# start of adding address to stack
addiu $a0, $fp, -16
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation <>
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
sub $a0, $a1, $a0
not $a0, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation <>
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
lw $a0, -16($fp)
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
# start of adding address to stack
addiu $a0, $fp, -8
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addToStack -- adding a number to stack
li $a0, 2
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
#### addToStack -- adding a number to stack
li $a0, 3
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addToStack -- end of adding a number to stack
# operation ==
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
sub $a0, $a1, $a0
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of operation ==
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
lw $a0, -8($fp)
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
