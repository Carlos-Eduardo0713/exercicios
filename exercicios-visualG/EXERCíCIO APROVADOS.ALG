Algoritmo "exercício aprovados"

Var
   n, i : inteiro
   nomes : vetor [0..9] de caractere
   n1 : vetor [0..9] de real
   n2 : vetor [0..9] de real
Inicio
    escreva("Quantos alunos serão digitados? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreval("Digite nome, primeira e segunda nota do", i+1, "o aluno:")
        leia(nomes[i])
        leia(n1[i])
        leia(n2[i])
    fimpara
    
    escreval("Alunos aprovados: ")
    
    para i de 0 ate n-1 faca
        se ((n1[i] + n2[i]) / 2) >= 6 entao
            escreval(nomes[i])
        fimse
    fimpara

Fimalgoritmo