dis = float(input('Qual a distancia? '))

if dis <= 200:
    v1 = dis * 0.5
    print('O preço é {:.1f}'.format(v1))

else:
    v2 = dis * 0.45
    print('O preço é {:.1f}'.format(v2))