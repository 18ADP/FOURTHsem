;Adarsh Pujari
;2241016496
mov ax, 0000h
mov ds,ax

mov al,[2000h]
mov cl,03h
sal al,cl
mov [2002h], al
hlt   