Algoritmo "exercício experiências"

Var
    C, R, S, i, cobaias, total_cobaias, testes : inteiro
    percent_c, percent_r, percent_s : real
    cobaia : caractere
Inicio

    escreva("Quantos casos de teste serão digitados? ")
    leia(testes)
    para i de 1 ate testes faca
        escreva("Quantidade de cobaias: ")
        leia(cobaias)
        escreva("Tipo de cobaia: ")
        leia(cobaia)
        
        escolha cobaia
        caso "C"
            C <- C + cobaias
        caso "R"
            R <- R + cobaias
        caso "S"
            S <- S + cobaias
        fimescolha
        total_cobaias <- total_cobaias + cobaias

    fimpara
    
    se (C <> 0) entao
        percent_c <- (C / total_cobaias) * 100
    fimse
    se (R <> 0) entao
        percent_r <- (R / total_cobaias) * 100
    fimse
    se (S <> 0) entao
        percent_s <- (S / total_cobaias) * 100
    fimse
    
    escreval("RELATÓRIO FINAL:")
    escreval("Total: ", total_cobaias, " cobaias")
    escreval("Total de coelhos: ", C)
    escreval("Total de ratos: ", R)
    escreval("Total de sapos: ", S)
    escreval("Percentual de coelhos: ", percent_c:4:2)
    escreval("Percentual de ratos: ", percent_r:4:2)
    escreva("Percentual de sapos: ", percent_s:4:2)
    
Fimalgoritmo