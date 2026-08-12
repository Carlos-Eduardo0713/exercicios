Algoritmo "Exercício pagamento"

Var
nome : caractere
valor_por_hora, horas_trabalhadas, pagamento : real
Inicio
      escreva("Nome: ")
      leia(nome)
      escreva("Valor por hora: ")
      leia(valor_por_hora)
      escreva("Horas trabalhadas: ")
      leia(horas_trabalhadas)
      
      pagamento <- valor_por_hora * horas_trabalhadas
      escreva("O pagamento para ", nome, " deve ser de ", pagamento:8:2)
Fimalgoritmo