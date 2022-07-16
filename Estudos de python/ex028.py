from random import randint

c = randint(0, 5)
m = int(input('Qual numero estou pensando: '))

if m == c:
    print('Vc acertou')
else:
    print('Vc errou')