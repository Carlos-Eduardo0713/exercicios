Algoritmo "exercício media pares"

Var
   n, i, pares, soma_pares : inteiro
   media_pares : real
   vet : vetor [0..9] de inteiro
Inicio
    escreva("Quantos elementos vai ter o vetor? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreva("Digite um número: ")
        leia(vet[i])

        se vet[i] % 2 = 0 entao
            pares <- pares + 1
            soma_pares <- soma_pares + vet[i]
        fimse
    fimpara
    
    se soma_pares = 0 entao
        escreva("NENHUM NÚMERO PAR")
    senao
        media_pares <- soma_pares / pares
        escreva("MEDIA DOS PARES = ", media_pares:4:1)
    fimse
Fimalgoritmo