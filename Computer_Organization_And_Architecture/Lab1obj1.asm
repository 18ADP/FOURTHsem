;Adarsh Pujari
;2241016496
mov ax,0000h
mov ds,ax 

mov ax, 3457h 
mov cx,ax
mov bx, 0015h
add ax,bx
mov [2000h],ax 
 
mov ax,cx
sub ax,bx
mov [2002h],ax

mov ax,cx            
mul bx
mov [2004h],ax
mov [2006h],dx

mov ax,cx
mov dx, 0000h
div bx
mov [2008h],ax
mov [2010h],dx
hlt

