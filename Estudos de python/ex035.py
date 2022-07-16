a = int(input('Primeiro segmento: '))
b = int(input('Segundo segmento: '))
c = int(input('Terceiro segmento: '))

if (a + b < c) or (a + c < b) or (b + c < a):
    print('Não forma um triangulo')

elif (a==b) and (a == c):
    print('é um triangulo equilatero')
elif (a==b) or (a==c) or (b==c):
    print('é um triangulo isósceles')
else:
    print('Escaleno')