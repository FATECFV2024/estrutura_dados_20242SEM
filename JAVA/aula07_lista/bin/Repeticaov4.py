''' testando a estrutura de repetição, para imprimir várias vezes a mensagem "Alô Mundo"
Algoritmo imprimirAloMundo
var i, n : inteiro
inicio
  escreva ("informe a quantidade de repetições que devem ser realizadas")
  leia (n)
  i <- 0
  enquanto i < n faça
     escreva (i, "Alô mundo")
     i <- i + 1
  fim_enquanto  
fim

'''

# a codificação em python

n = int(input("informe a quantidade de repetições que devem ser realizadas"))
i = 0
while i < n :
    print (i, "Alô mundo")
    i = i + 1
    
for i in range (n):
    print (i, "Alô mundo")