Algoritmo "exercício mais velho"

Var
   n, i, oldest_age : inteiro
   oldest_person : caractere
   vet_nome : vetor [0..9] de caractere
   vet_idade : vetor [0..9] de inteiro
Inicio
    escreva("Quantas pessoas você vai digitar? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreval("Dados da", i+1, "a pessoa:")
        escreva("Nome: ")
        leia(vet_nome[i])
        escreva("Idade: ")
        leia(vet_idade[i])
    fimpara
    
    oldest_age <- vet_idade[0]
    oldest_person <- vet_nome[0]
    
    para i de 0 ate n-1 faca
        se vet_idade[i] > oldest_age entao
            oldest_age <- vet_idade[i]
            oldest_person <- vet_nome[i]
        fimse
    fimpara
    
    escreva("PESSOA MAIS VELHA: ", oldest_person)

Fimalgoritmo