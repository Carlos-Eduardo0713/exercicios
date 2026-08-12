Algoritmo "exercício acima diagonal"

Var
   n, i, j, soma: inteiro
   mat : vetor [0..9, 0..9] de inteiro
Inicio
    escreva("Qual a ordem da matriz? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        para j de 0 ate n-1 faca
            escreva("Elemento [", i, ",", j, "]: ")
            leia(mat[i, j])
        fimpara
    fimpara
    
    para i de 0 ate n-1 faca
        para j de 0 ate n-1 faca
            se (j > i) e (i + j > i) entao
                soma <- soma + mat[i, j])
            fimse
        fimpara
    fimpara
    
    escreva("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = ", soma)
    
    
    // para i de 0 ate N-1 faca
    //     para j de i+1 ate N-1 faca
       //      soma <- soma + mat[i, j]
      //   fimpara
   //  fimpara

   // bastava verificar os elementos da coluna "1 a mais" que o número da linha
Fimalgoritmo