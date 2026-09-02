Algoritmo "exercício par impar"

Var
   qtd, num, i : inteiro
   cond1, cond2 : caractere
Inicio
    escreva("Quantos números você vai digitar? ")
    leia(qtd)
    para i de 1 ate qtd faca
        escreva("Digite um número: ")
        leia(num)
        se num % 2 = 0 entao
            cond1 <- "PAR"
        senao
            cond1 <- "ÍMPAR"
        fimse
        se num > 0 entao
            cond2 <- "POSITIVO"
        senao
            se num < 0 entao
                cond2 <- "NEGATIVO
            senao
                cond1 <- "NULO"
                cond2 <- ""
            fimse
        fimse
        escreval(cond1, " ", cond2)
    fimpara
Fimalgoritmo