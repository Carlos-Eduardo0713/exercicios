Algoritmo "exercício alturas"

Var
    n, i, idade : inteiro
    nome : caractere
    altura, altura_media, menores_16, soma_alturas, percent_menos16 : real
    vetnome : vetor [0..9] de caractere
    vetidade : vetor [0..9] de inteiro
    vetaltura : vetor [0..9] de real
Inicio
    escreva("Quantas pessoas serão digitadas? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreval("Dados da ", (i + 1), "a pessoa: ")
        escreva("Nome: ")
        leia(vetnome[i])
        escreva("Idade: ")
        leia(vetidade[i])
        escreva("Altura: ")
        leia(vetaltura[i])
        soma_alturas <- soma_alturas + vetaltura[i])
    fimpara
    
    altura_media <- soma_alturas / n
    escreval()
    escreval("Altura média: ", altura_media:3:2)
    
    para i de 0 ate n-1 faca
        se vetidade[i] < 16 entao
            menores_16 <- menores_16 + 1
        fimse
    fimpara
    
    percent_menos16 <- (menores_16 / n) * 100
    
    escreval("Pessoas com menos de 16 anos: ", percent_menos16:4:2, "%")
    
    para i de 0 ate n-1 faca
        se vetidade[i] < 16 entao
            escreval(vetnome[i])
        fimse
    fimpara
    
Fimalgoritmo