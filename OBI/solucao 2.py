N = int(input("número de premiados: "))
cont1 = 0
cont2 = 0
cont = 0
list = []
ti = input("tamanhos solicitados: ")
t = ti.split(' ')
print(ti.split(' '))
list.append(t)

while cont < N:
    cont = cont + 1
    if list[cont] == '1':
        cont1 += 1
        print('1')
    else:
        cont2 += 1
P = int(input("número de camisetas de tamanho pequeno produzidas: "))
M = int(input("número de camisetas de tamanho medias produzidas: "))
if cont1 == P and cont2 == M:
    print("S")
else:
    print("N")