Algoritmo "exercício divisão"

Var
   qtd, numerador, denominador, i : inteiro
   resultado : real
Inicio
    escreva("Quantos casos você vai digitar? ")
    leia(qtd)
    para i de 1 ate qtd faca
        escreva("Entre com o numerador: ")
        leia(numerador)
        escreva("Entre com o denominador: ")
        leia(denominador)
        se denominador = 0 entao
            escreval("DIVISÃO IMPOSSÍVEL")
        senao
            resultado <- numerador / denominador
            escreval("DIVISÃO = ", resultado:4:2)
        fimse
    fimpara
Fimalgoritmo