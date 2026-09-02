Algoritmo "Exercícios troco"

Var
preco_produto, qtd_produto, pagamento, troco : real
Inicio
      escreva("Preço unitário do produto: ")
      leia(preco_produto)
      escreva("Quantidade comprada: ")
      leia(qtd_produto)
      escreva("Dinheiro recebido: ")
      leia(pagamento)

      troco <- pagamento - (preco_produto * qtd_produto)
      escreva("TROCO = ", troco:7:2)
Fimalgoritmo