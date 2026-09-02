Algoritmo "exercício dentro_fora"

Var
   qtd, num, in, out, i : inteiro
Inicio
    escreva("Quantos números você vai digitar? ")
    leia(qtd)
    para i de 1 ate qtd faca
        escreva("Digite um número: ")
        leia(num)
        se (num >= 10) e (num <= 20) entao
            in <- in + 1
        senao
            out <- out + 1
        fimse
    fimpara
    escreval(in, " DENTRO")
    escreva(out, " FORA")
Fimalgoritmo