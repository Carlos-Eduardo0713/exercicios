Algoritmo "exercício abaixo da média"

Var
    n, i : inteiro
    media_vetor, abaixo_damedia, soma_vetor : real
    vet : vetor [0..9] de real
Inicio
    escreva("Quantos elementos vai ter o vetor? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreva("Digite um número: ")
        leia(vet[i])
        soma_vetor <- soma_vetor + vet[i]
    fimpara
    
    media_vetor <- soma_vetor / n

    escreval
    escreval("MEDIA DO VETOR = ", media_vetor:6:3)
    escreval("ELEMENTOS ABAIXO DA MÉDIA:")
    
    para i de 0 ate n-1 faca
        se vet[i] < media_vetor entao
            escreval(vet[i])
        fimse
    fimpara
Fimalgoritmo