Algoritmo "exrcício fatorial"

Var
   n, fatorial, i : inteiro
Inicio
    fatorial <- 1
    escreva("Escreva o valor de N: ")
    leia(n)
    para i de 1 ate n faca
        fatorial <- fatorial * i
    fimpara
    escreva("FATORIAL = ", fatorial)
Fimalgoritmo