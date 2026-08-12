Algoritmo "exercício combustível"

Var
cod, alcool, gas, diesel : inteiro
Inicio
      escreva("Informe um código (1, 2, 3) ou 4 para parar: ")
      leia(cod)
      enquanto cod <> 4 faca
          se cod = 1 entao
              alcool <- alcool + 1
          senao
              se cod = 2 entao
                  gas <- gas + 1
              senao
                  se cod = 3 entao
                      diesel <- diesel + 1
                  fimse
              fimse
          fimse
          escreva("Informe um código (1, 2, 3) ou 4 para parar: ")
          leia(cod)
      fimenquanto
      escreval("MUITO OBRIGADO")
      escreval("Alcool: ", alcool)
      escreval("Gasolina: ", gas)
      escreva("Diesel: ", diesel)
Fimalgoritmo