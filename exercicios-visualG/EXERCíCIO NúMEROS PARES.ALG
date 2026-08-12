Algoritmo "exercício números pares"

Var
   n, i, qtd_pares : inteiro
   vet_pares : vetor [0..9] de inteiro
Inicio
    escreva("Quantos números você vai digitar? ")
    leia(n)
    para i de 0 ate n-1 faca
        escreva("Digite um número: ")
        leia(vet_pares[i])
    fimpara
    
    escreval("NÚMEROS PARES:")
    para i de 0 ate n-1 faca
        se (vet_pares[i] % 2) = 0 entao
            escreva(vet_pares[i], " ")
        fimse
    fimpara
    
    escreval
    
    para i de 0 ate n-1 faca
        se (vet_pares[i] % 2) = 0 entao
            qtd_pares <- qtd_pares + 1
        fimse
    fimpara
    
    escreva("QUANTIDADE DE PARES = ", qtd_pares)
Fimalgoritmo