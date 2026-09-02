Algoritmo "exrcício notas"

Var
n1, n2, nf : real
Inicio
      escreva("Digite a primeira nota: ")
      leia(n1)
      escreva("Digite a segunda nota: ")
      leia(n2)
      nf <- n1 + n2
      
      se nf >= 60 entao
         escreva("NOTA FINAL = ", nf:3:1)
      senao
           escreval("NOTA FINAL = ", nf:3:1)
           escreva("REPROVADO")
      fimse
Fimalgoritmo