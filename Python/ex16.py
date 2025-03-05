# [DESAFIO] Escreva um programa para calcular a redução do tempo
# de vida de um fumante. Pergunte a quantidade de cigarros fumados
# por dias e quantos anos ele já fumou. Considere que um fumante
# perde 10 min de vida a cada cigarro. Calcule quantos dias de vida
# um fumante perderá e exiba o total em dias.
# 1- Receber a quantidade de cigarros fumados por dia e armazenar em uma variável (qtd)
# 2- Multiplicar a variável por 10 para obter os minutos perdidos
# 3- Dividir o resultado por 1440 para obter os dias perdidos e exibir o resultado na tela

qtd = int(input("Quantos cigarros você fuma por dia? \n"))
minutos_perdidos = 10 * qtd
dias_perdidos = minutos_perdidos / 1440
print("Você perderá um total de", dias_perdidos,"dias de vida!")