Algoritmo "exercício lanchonete"

Var
qtd, valor_final, cod, preco: real
Inicio
      escreva("Código do produto comprado: ")
      leia(cod)
      escolha cod
      caso 1
           preco <- 5
      caso 2
           preco <- 3.5
      caso 3
           preco <- 4.8
      caso 4
           preco <- 8.9
      caso 5
           preco <- 7.32
      fimescolha
      
      escreva("Quantidade comprada: ")
      leia(qtd)
      
      valor_final <- preco * qtd
      
      escreva("Valor a pagar: R$ ", valor_final:4:2)

Fimalgoritmo