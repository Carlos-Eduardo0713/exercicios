Algoritmo "exercício soma vetor"

Var
   n, i : inteiro
   vet : vetor [0..9] de real
   soma, media : real
Inicio
    escreva("Quantos números você vai digitar? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreva("Digite um número: ")
        leia(vet[i])
        soma <- soma + vet[i]
    fimpara
    
    escreva("VALORES = ")
    para i de 0 ate n-1 faca
        escreva(vet[i]:4:1, " ")
    fimpara
    escreval()
    escreval("SOMA = ", soma:4:2)
    media <- soma / n
    escreva("MEDIA = ", media:4:2)
Fimalgoritmo