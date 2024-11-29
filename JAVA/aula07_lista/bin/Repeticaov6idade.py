''' testando a estrutura de repetição, para entrada da idade de um conjunto de pessoas
Algoritmo imprimirAloMundo
var i, n, idade : inteiro
inicio
  escreva ("informe a quantidade de pessoass")
  leia (n)
  i <- 0
  enquanto i < n faça
     escreva ("informe a idade:  ")
     leia (idade)
     i = i + 1
  fim_enquanto 
  // exemplificando com o para também
  para i <- 1 até n faça
     escreva ("informe a idade:  ")
     leia (idade)
  fim_Para
   
fim

'''

# a codificação em python

n = int(input("informe a quantidade de pessoas"))
i = 0
while i < n :
    idade  = int(input("informe a idade"))
    i = i + 1
    
for i in range (n):
    idade  = int(input("informe a idade"))