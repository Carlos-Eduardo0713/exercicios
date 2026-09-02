Algoritmo "exercício pares consecutivos"

Var
x, soma, cont, result : inteiro
Inicio
      escreva("Digite um número inteiro: ")
      leia(x)
      
      enquanto x <> 0 faca
          result <- 0
          cont <- 0
          se (x % 2) = 0 entao
              soma <- x
              enquanto cont <= 4 faca
                  result <- result + soma
                  soma <- soma + 2
                  cont <- cont + 1
              fimenquanto
          senao
              soma <- x + 1
              enquanto cont <= 4 faca
                  result <- result + soma
                  soma <- soma + 2
                  cont <- cont + 1
              fimenquanto
          fimse
          escreval("SOMA = ", result)
          escreva("Digite um número inteiro: ")
          leia(x)
      fimenquanto
Fimalgoritmo