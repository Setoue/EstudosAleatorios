frase = str(input('Digite uma frase: ')).upper().strip()

print('A letra A aparece {} ' .format(frase.count('A'))) #vai contar quantas letras A possui a frase digitada

print('A primeira letra A apareceu na posição {}'.format(frase.find('A')+1))

print('Ultima letra A apareceu na posição {}'.format(frase.rfind('A')+1))

