.data
scheduler: .space  200
___ACTOR_Proegram: .space 88
___ACTOR_vahid: .space 88
str2: .asciiz    "IndexOutOfBoundError"
.text
main:
move $fp, $sp
move $t7, $fp
addi $t7, $t7, -32768
# Init Scheduler
li $a0, 0
la $a1, scheduler
sw $a0, 0($a1)
li $t6, 0
li $s0, 0
#--- PCB: ___ACTOR_Proegram
la $a0, ___ACTOR_Proegram
li $a1, 0
sw $a1, 0($a0)
sw $a1, 4($a0)
la $a1, scheduler
lw $a2 ,0($a1)
li $a3, 4
mul $a3, $a2, $a3
add $a3, $a3, $a1
sw $a0, 4($a3)
addi $a2, $a2, 1
sw $a2, 0($a1)
# ___ACTOR_Proegram << ___ACTOR_Proegram__RECEIVER_init____
la $a0,___ACTOR_Proegram
la $a1,___ACTOR_Proegram__RECEIVER_init____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 2
sw $a2, 0($a0)
addi $s0, $s0, 1
#--- PCB: ___ACTOR_vahid
la $a0, ___ACTOR_vahid
li $a1, 0
sw $a1, 0($a0)
sw $a1, 4($a0)
la $a1, scheduler
lw $a2 ,0($a1)
li $a3, 4
mul $a3, $a2, $a3
add $a3, $a3, $a1
sw $a0, 4($a3)
addi $a2, $a2, 1
sw $a2, 0($a1)
# ___ACTOR_vahid << ___ACTOR_vahid__RECEIVER_init____
la $a0,___ACTOR_vahid
la $a1,___ACTOR_vahid__RECEIVER_init____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 2
sw $a2, 0($a0)
addi $s0, $s0, 1
# ___SCHEDULER
schedulerCode: 
la $a0, scheduler
lw $a1, 0($a0)
rem $t6, $t6, $a1
li $a2, 4
mul $a2, $t6, $a2
add $a2, $a2, $a0
lw $a3, 4($a2)
lw $t0, 0($a3)
lw $t1, 4($a3)
beq $t1, $t0, ___ACTOR_HAS_NO_MESSAGE
li $a2, 4
mul $a2, $t1, $a2
add $a2, $a2, $a3
addi $t1, $t1, 2
sw, $t1, 4($a3)
addi $s0, $s0, -1
lw $t3, 8($a2)
lw $t5, 12($a2)
jalr $t3
___ACTOR_HAS_NO_MESSAGE:
beqz $s0, HALT
addi $t6, $t6, 1
j schedulerCode
___ACTOR_Proegram__RECEIVER_init____:
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
addiu $a0, $fp, -4
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -8
sw $a0, 0($sp)
addiu $sp, $sp, -4
addiu $a0, $fp, -12
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
#### addVariableToStack -- adding a number to stack
li $a0, 101
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 114
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 103
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
# start of adding variable to stack
lw $a0, -4($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# pop stack
addiu $sp, $sp, 12
# end of pop stack
#### addVariableToStack -- adding a number to stack
li $a0, 5
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# start of adding address to stack
addiu $a0, $fp, -4
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding address to stack
# access array
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
li $a2, 3
bgt $a1, $a2, INDEXOUTOFBOUNDERROR
li $t0, 4
mul $a1, $a1, $t0
sub $a0, $a0, $a1
lw $a0, 0($a0)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end access array
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
addiu $sp, $sp, 20
# end of pop stack
jr $ra
___ACTOR_Proegram__RECEIVER_vahid2_int____:
lw $a0, 0($t5)
sw $a0, 0($sp)
addi $sp, $sp, -4
addi $t5, $t5, 4
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
lw $a0, 0($fp)
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
addiu $sp, $sp, 8
# end of pop stack
jr $ra
___ACTOR_Proegram__RECEIVER_vahid3____:
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
li $a0, 6
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
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
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
# pop stack
addiu $sp, $sp, 8
# end of pop stack
jr $ra
___ACTOR_Proegram__RECEIVER_mamad_array_char_____:
lw $a0, 0($t5)
sw $a0, 0($sp)
addi $sp, $sp, -4
addi $t5, $t5, 4
lw $a0, 0($t5)
sw $a0, 0($sp)
addi $sp, $sp, -4
addi $t5, $t5, 4
lw $a0, 0($t5)
sw $a0, 0($sp)
addi $sp, $sp, -4
addi $t5, $t5, 4
lw $a0, 0($t5)
sw $a0, 0($sp)
addi $sp, $sp, -4
addi $t5, $t5, 4
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
li $a0, 5
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
lw $a0, -4($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -8($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing
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
addiu $sp, $sp, 16
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
# pop stack
addiu $sp, $sp, 20
# end of pop stack
jr $ra
# pop stack
addiu $sp, $sp, 0
# end of pop stack
___ACTOR_vahid__RECEIVER_init____:
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
#### addVariableToStack -- end of adding a number to stack
# pop stack
addiu $sp, $sp, 16
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
addiu $a0, $fp, -12
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
#### addVariableToStack -- adding a number to stack
li $a0, 100
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# start of assign
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 16($sp)
sw $a0, 0($a1)
sw $a0, 16($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 16($sp)
sw $a0, 0($a1)
sw $a0, 16($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 16($sp)
sw $a0, 0($a1)
sw $a0, 16($sp)
lw $a0, 4($sp)
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a1, 16($sp)
sw $a0, 0($a1)
sw $a0, 16($sp)
# end of assign
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
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# writing
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
addiu $sp, $sp, 16
# end of pop stack
addi $a0, $zero, 10
# start syscall 11
li $v0, 11
syscall
# end syscall
# end of writing
#### addVariableToStack -- adding a number to stack
li $a0, 345
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
# ___ACTOR_Proegram << ___ACTOR_Proegram__RECEIVER_vahid2_int____
la $a0,___ACTOR_Proegram
la $a1,___ACTOR_Proegram__RECEIVER_vahid2_int____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 2
sw $a2, 0($a0)
addi $s0, $s0, 1
# Adding Receiver params to data segment
lw $a0, 4($sp)
sw $a0, 0($t7)
addi $t7, $t7, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# ___ACTOR_Proegram << ___ACTOR_Proegram__RECEIVER_vahid3____
la $a0,___ACTOR_Proegram
la $a1,___ACTOR_Proegram__RECEIVER_vahid3____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 2
sw $a2, 0($a0)
addi $s0, $s0, 1
# Adding Receiver params to data segment
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
lw $a0, -12($fp)
sw $a0, 0($sp)
addiu $sp, $sp, -4
# end of adding variable to stack
# ___ACTOR_Proegram << ___ACTOR_Proegram__RECEIVER_mamad_array_char_____
la $a0,___ACTOR_Proegram
la $a1,___ACTOR_Proegram__RECEIVER_mamad_array_char_____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 2
sw $a2, 0($a0)
addi $s0, $s0, 1
# Adding Receiver params to data segment
lw $a0, 4($sp)
sw $a0, 0($t7)
addi $t7, $t7, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a0, 4($sp)
sw $a0, 0($t7)
addi $t7, $t7, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a0, 4($sp)
sw $a0, 0($t7)
addi $t7, $t7, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
lw $a0, 4($sp)
sw $a0, 0($t7)
addi $t7, $t7, -4
# pop stack
addiu $sp, $sp, 4
# end of pop stack
# ___ACTOR_vahid << ___ACTOR_vahid__RECEIVER_mamd2____
la $a0,___ACTOR_vahid
la $a1,___ACTOR_vahid__RECEIVER_mamd2____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 2
sw $a2, 0($a0)
addi $s0, $s0, 1
# Adding Receiver params to data segment
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
# writing
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
addiu $sp, $sp, 12
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
jr $ra
___ACTOR_vahid__RECEIVER_mamd2____:
#### addVariableToStack -- adding a number to stack
li $a0, 0
sw $a0, 0($sp)
addiu $sp, $sp, -4
#### addVariableToStack -- end of adding a number to stack
#### addVariableToStack -- adding a number to stack
li $a0, 123
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
addiu $sp, $sp, 4
# end of pop stack
jr $ra
# pop stack
addiu $sp, $sp, 0
# end of pop stack
# pop stack
addiu $sp, $sp, 0
# end of pop stack
INDEXOUTOFBOUNDERROR:
la $a0, str2
# start syscall 4
li $v0, 4
syscall
# end syscall
HALT:
# start syscall 10
li $v0, 10
syscall
# end syscall
