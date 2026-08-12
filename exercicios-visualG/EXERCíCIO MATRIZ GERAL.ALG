Algoritmo "exercício matriz geral"

Var
   n, i, j, l, c : inteiro
   soma_positivos : real
   mat : vetor [0..9, 0..9] de real
Inicio
    escreva("Qual a ordem da matriz? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        para j de 0 ate n-1 faca
            escreva("Elemento [", i, ",", j, "]: ")
            leia(mat[i, j])
        fimpara
    fimpara
    
    escreval
    
    para i de 0 ate n-1 faca
        para j de 0 ate n-1 faca
            se mat[i, j] > 0 entao
                soma_positivos <- soma_positivos + mat[i, j])
            fimse
        fimpara
    fimpara
    
    escreval("SOMA DOS POSITIVOS: ", soma_positivos:3:1)
    escreval
    
    escreva("Escolha uma linha: ")
    leia(l)
    escreva("LINHA ESCOLHIDA: ")
    
    para i de 0 ate n-1 faca
        escreva(mat[l, i]:3:1, " ")
    fimpara
    
    escreval
    escreval
    
    escreva("Escolha uma coluna: ")
    leia(c)
    escreva("COLUNA ESCOLHIDA: ")
    
    para i de 0 ate n-1 faca
        escreva(mat[i, c]:3:1, " ")
    fimpara
    
    escreval
    escreval
    
    escreva("DIAGONAL PRINCIPAL: ")
    para i de 0 ate n-1 faca
        escreva(mat[i, i]:3:1, " ")
    fimpara
    
    escreval
    escreval
    
    para i de 0 ate n-1 faca
        para j de 0 ate n-1 faca
            se mat[i, j] < 0 entao
                mat[i, j] <- (mat[i, j])^2
            fimse
        fimpara
    fimpara
    
    escreval("MATRIZ ALTERADA:")
    
    para i de 0 ate n-1 faca
        para j de 0 ate n-1 faca
            escreva(mat[i, j]:3:1, " ")
        fimpara
        escreval
    fimpara
    
Fimalgoritmo