Algoritmo "exercício média ponderada"

Var
   n1, n2, n3, media : real
   qtd, i : inteiro
Inicio
    escreva("Quantos vasos você vai digitar? ")
    leia(qtd)
    para i de 1 ate qtd faca
        escreval("Digite três números:")
        leia(n1)
        leia(n2)
        leia(n3)
        media <- ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10
        escreval("MEDIA = ", media:2:1)
    fimpara
Fimalgoritmo