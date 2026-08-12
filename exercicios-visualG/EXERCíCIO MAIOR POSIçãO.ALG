Algoritmo "exercício maior posição"

Var
    n, i, indice_maior : inteiro
    vet : vetor [0..9] de inteiro
    maior : real
Inicio
    escreva("Quantos números você vai digitar? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreva("Digite um número: ")
        leia(vet[i])
    fimpara

    maior <- vet[0]
    
    para i de 0 ate n-1 faca
        se vet[i] > maior entao
            maior <- vet[i]
            indice_maior <- i
        fimse
    fimpara
    
    escreval("MAIOR VALOR = ", maior:4:1)
    escreva("POSIÇÃO DO MAIOR VALOR = ", indice_maior)
    
Fimalgoritmo