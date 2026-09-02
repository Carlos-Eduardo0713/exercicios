Algoritmo "exercício troco verificado"

Var
preco, qtd, pagamento, troco, restante, valor_a_pagar : real
Inicio
      escreva("Preço unitário do produto: ")
      leia(preco)
      escreva("Quantidade comprada: ")
      leia(qtd)
      escreva("Dinheiro recebido: ")
      leia(pagamento)
      
      valor_a_pagar <- preco * qtd
      
      se pagamento >= valor_a_pagar entao
         troco <- pagamento - valor_a_pagar
         escreva("TROCO = ", troco:4:2)
      senao
           restante <- valor_a_pagar - pagamento
           escreva("DINHEIRO INSUFICIENTE. FALTAM", restante, " REAIS")
      fimse
Fimalgoritmo