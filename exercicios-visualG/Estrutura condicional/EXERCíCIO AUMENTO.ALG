Algoritmo "exercício aumento"

Var
sal_atual, novo_sal, aumento, porcentagem : real
Inicio
      escreva("Digite o salário da pessoa: ")
      leia(sal_atual)
      
      se sal_atual <= 1000 entao
         porcentagem <- 20
         aumento <- ((20/100) * sal_atual)
         novo_sal <- sal_atual + aumento
      senao
           se sal_atual <= 3000 entao
              porcentagem <- 15
              aumento <- ((15/100) * sal_atual)
              novo_sal <- sal_atual + aumento
           senao
                se sal_atual <= 8000 entao
                      porcentagem <- 10
                      aumento <- ((10/100) * sal_atual)
                      novo_sal <- sal_atual + aumento
                senao
                        porcentagem <- 5
                        aumento <- ((5/100) * sal_atual)
                        novo_sal <- sal_atual + aumento
                fimse
           fimse
      fimse

      escreval("Novo salário = R$ ", novo_sal:6:2)
      escreval("Aumento = R$ ", aumento:6:2)
      escreval("Porcentagem =", porcentagem, "%")
Fimalgoritmo