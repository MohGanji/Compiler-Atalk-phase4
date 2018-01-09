.data
scheduler: .space  200
___ACTOR_Proegram: .space 88
___ACTOR_vahid: .space 88
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
# ___ACTOR_Proegram << ___ACTOR_Proegram__RECEIVER0____
la $a0,___ACTOR_Proegram
la $a1,___ACTOR_Proegram__RECEIVER0____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 1
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
# ___ACTOR_vahid << ___ACTOR_vahid__RECEIVER1____
la $a0,___ACTOR_vahid
la $a1,___ACTOR_vahid__RECEIVER1____
li $a3, 4
lw $a2, 0($a0)
mul $a3, $a2, $a3
add $a3, $a0, $a3
sw $a1, 8($a3)
sw $t7, 12($a3)
addi $a2, $a2, 1
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
addi $t1, $t1, 1
sw, $t1, 4($a3)
addi $s0, $s0, -1
lw $t3, 8($a2)
lw $t5, 12($a2)
jalr $t3
___ACTOR_HAS_NO_MESSAGE:
beqz $s0, HALT
addi $t6, $t6, 1
j schedulerCode
___ACTOR_Proegram__RECEIVER0____:
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
# pop stack
addiu $sp, $sp, 0
# end of pop stack
jr $ra
# pop stack
addiu $sp, $sp, 0
# end of pop stack
___ACTOR_vahid__RECEIVER1____:
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
addiu $sp, $sp, 0
# end of pop stack
jr $ra
# pop stack
addiu $sp, $sp, 0
# end of pop stack
# pop stack
addiu $sp, $sp, 0
# end of pop stack
HALT:
# start syscall 10
li $v0, 10
syscall
# end syscall
