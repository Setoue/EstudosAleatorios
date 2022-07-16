sal = float(input('Qual é o salário? '))

if sal > 1250:
    sal1 = (sal * 0.1) + sal
    print('Seu aumeto é: {:.1f}'.format(sal1))

else:
    sal2 = (sal * 1.5) + sal
    print('Seu aumento é: {:.1f}'.format(sal2))