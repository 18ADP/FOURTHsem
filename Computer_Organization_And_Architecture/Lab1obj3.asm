;ADARSH PUJARI
;2241016496
mov ax,0000h
mov ds,ax 
mov al,[3000H]

mov bl,al
shr al,01h
xor al,bl
mov [3001h],al
hlt