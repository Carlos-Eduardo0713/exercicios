Algoritmo "exercício múltiplos"

Var
n1, n2, maior, menor : inteiro
Inicio
      escreval("Digite dois números inteiros: ")
      leia(n1)
      leia(n2)
      
      se (n1 % n2 = 0) ou (n2 % n1 = 0) entao
         escreva("São múltiplos")
      senao
           escreva("Não são múltiplos")
      fimse
Fimalgoritmo