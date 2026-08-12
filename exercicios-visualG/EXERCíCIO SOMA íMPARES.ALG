Algoritmo "exercício soma ímpares"

Var
    x, y, i, maior, menor, soma : inteiro
Inicio
    escreval("Digite dois números: ")
    leia(x)
    leia(y)
    se x >= y entao
        maior <- x
        menor <- y
    senao
        maior <- y
        menor <- x
    fimse
    
    para i de (menor + 1) ate (maior - 1) faca
        se i % 2 <> 0 entao
            soma <- soma + i
        fimse
    fimpara
    
    escreva("SOMA DOS ÍMPARES: ", soma)
Fimalgoritmo
