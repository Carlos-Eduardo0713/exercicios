Algoritmo "exercício comerciante"

Var
   n, i, lucros_abaixo10, lucros_entre10e20, lucros_maiores20 : inteiro
   valor_totalcompra, valor_totalvenda, lucro_total : real
   nomes : vetor [0..9] de caractere
   preco_compra : vetor [0..9] de real
   preco_venda : vetor [0..9] de real
   lucros : vetor [0..9] de real
Inicio
    escreva("Serão digitados dados de quantos produtos? ")
    leia(n)
    
    para i de 0 ate n-1 faca
        escreval("Produto", i+1, ":")
        escreva("Nome: ")
        leia(nomes[i])
        escreva("Preço de compra: ")
        leia(preco_compra[i])
        escreva("Preço de venda: ")
        leia(preco_venda[i])
        
        valor_totalcompra <- valor_totalcompra + preco_compra[i]
        valor_totalvenda <- valor_totalvenda + preco_venda[i]
        lucro_total <- valor_totalvenda - valor_totalcompra
        
    fimpara
    
    para i de 0 ate n-1 faca
        lucros[i] <- (((preco_venda[i] - preco_compra[i]) / preco_compra[i]) * 100)
        //lucros[i] <- (preco_venda - preco_compra)
    fimpara
    
    escreval
    escreval("RELATÓRIO:")
    para i de 0 ate n-1 faca
        se lucros[i] < 10 entao
            lucros_abaixo10 <- lucros_abaixo10 + 1
        senao
            se lucros[i] <= 20 entao
                lucros_entre10e20 <- lucros_entre10e20 + 1
            senao
                lucros_maiores20 <- lucros_maiores20 + 1
            fimse
        fimse
    fimpara
        
    escreval("Lucro abaixo de 10%:", lucros_abaixo10)
    escreval("Lucros entre 10% e 20%:", lucros_entre10e20)
    escreval("Lucros acima de 20%:", lucros_maiores20)
    escreval("Valor total de compra: ", valor_totalcompra:4:2)
    escreval("Valor total de venda: ", valor_totalvenda:4:2)
    escreva("Lucro total: ", lucro_total:4:2)

Fimalgoritmo