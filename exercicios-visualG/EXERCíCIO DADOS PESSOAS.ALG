Algoritmo "exercício dados pessoas"

Var
   n, i, num_homens, soma_muie : inteiro
   menor_altura, maior_altura, media_muie, soma_alturas_muie : real
   alturas : vetor [0..9] de real
   generos : vetor [0..9] de caractere
Inicio
    escreva("Quantas pessoas serão digitadas? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreva("Altura da", i+1, "a pessoa: ")
        leia(alturas[i])
        escreva("Gênero da", i+1, "a pessoa: ")
        leia(generos[i])
        
        se generos[i] = "F" entao
            soma_muie <- soma_muie + 1
            soma_alturas_muie <- soma_alturas_muie + alturas[i]
        senao
            num_homens <- num_homens + 1
        fimse
    fimpara
    
    menor_altura <- alturas[0]
    maior_altura <- alturas[0]
    
    para i de 0 ate n-1 faca
        se alturas[i] < menor_altura entao
            menor_altura <- alturas[i]
        fimse
        se alturas[i] > maior_altura entao
            maior_altura <- alturas[i]
        fimse
    fimpara
    
    media_muie <- soma_alturas_muie / soma_muie
    
    escreval("Menor altura = ", menor_altura:3:2)
    escreval("Maior altura = ", maior_altura:3:2)
    escreval("Média das alturas das mulheres = ", media_muie:3:2)
    escreva("Número de homens = ", num_homens)

Fimalgoritmo