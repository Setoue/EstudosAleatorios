velocidade = int(input('velocidade do carro?'))
preco = (velocidade - 80)*7

if velocidade > 80:
    print('Vc foi multado, tem que pagar {} reais'.format(preco))
else:
    print('Tudo okay')