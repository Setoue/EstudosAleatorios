nome = str(input('Digite seu nome completo: ')).strip()    #o .strip remove todos os espaços antes e depois da string
print('analisando seu nome...')
print('Seu nome em maiúsculo é {}'.format(nome.upper()))  # deixa todas as letras em maiúsculo
print('Seu nome em minúsculo é {}'.format(nome.lower()))  # deixa todas as letras em minúsculo
print('Seu nome tem {} letras'.format(len(nome)-nome.count(' '))) #vai ler todas as letras e retirar da contagem o espaço
#print('Seu primeiro nome tem {}'.format(nome.find(' ')))  # ele vai ler todas as letras antes do espaço

separa  = nome.split()
print('Seu primeiro nome é {} e possui {} letras'.format(separa[0], len(separa[0])))
     # outra forma de printar o primeiro nome e fazer a contagem das letras
