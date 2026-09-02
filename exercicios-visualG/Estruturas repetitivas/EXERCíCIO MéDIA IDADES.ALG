Algoritmo "exercício média idades"

Var
idade, soma, cont: inteiro
media : real
Inicio
      escreval("Digite as idades: ")
      leia(idade)
      se idade < 0 entao
         escreva("IMPOSSÍVEL CALCULAR")
      senao
           enquanto idade >= 0 faca
                    soma <- soma + idade
                    cont <- cont + 1
                    leia(idade)
           fimenquanto
           media <- soma / cont
           escreva("MEDIA = ", media:4:2)
      fimse
Fimalgoritmo