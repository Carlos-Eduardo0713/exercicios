Algoritmo "semnome"

Var
    base_retangulo, altura_retangulo, area, perimetro, diagonal : real
Inicio
      escreval("Digite a base do retângulo:")
      leia(base_retangulo)
      escreval("Digite a altura do retângulo:")
      leia(altura_retangulo)
      area <- base_retangulo * altura_retangulo
      perimetro <- (base_retangulo * 2) + (altura_retangulo * 2)
      diagonal <- RaizQ((base_retangulo)^2 + (altura_retangulo)^2)
      escreval("AREA: ", area:7:4)
      escreval("PERIMETRO: ", perimetro:7:4)
      escreval("DIAGONAL : ", diagonal:7:4)
Fimalgoritmo