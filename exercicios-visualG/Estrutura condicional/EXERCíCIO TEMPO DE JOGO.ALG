Algoritmo "exercício tempo de jogo"

Var
hora_inicial, hora_final, duracao : inteiro
Inicio
      escreva("Hora inicial: ")
      leia(hora_inicial)
      escreva("Hora final: ")
      leia(hora_final)
      
      se hora_inicial < hora_final entao
         duracao <- hora_final - hora_inicial
      senao
           duracao <- 24 - hora_inicial + hora_final
      fimse
      
      escreva("O JOGO DUROU ", duracao, " HORAS")

Fimalgoritmo