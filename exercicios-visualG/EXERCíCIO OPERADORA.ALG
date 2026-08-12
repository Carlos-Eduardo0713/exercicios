Algoritmo "exercício operadora"

Var
min, valor : real
Inicio
      escreva("Digite a quantidade de minutos: ")
      leia(min)

      se min <= 100 entao
         valor <- 50
      senao
           valor <- 50 + (min - 100) * 2
      fimse
      
      escreva("Valor a pagar: R$ ", valor:4:2)
Fimalgoritmo