def RangeLister(menor, maior):
    lista = [] 
    tamanho = (maior - menor) + 1

    for i in range(tamanho):
        lista.append(menor)
        menor += 1
    return lista

menor = int(input("Escreva o menor valor da lista: "))
maior = int(input("Escreva o maior valor da lista: "))

resultado = RangeLister(menor, maior)

print("O array criado é: [", end=" ")
for i in range(len(resultado)):
    print(resultado[i], end =" ")
print("]")
        