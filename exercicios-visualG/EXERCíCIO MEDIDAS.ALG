Algoritmo "Exercício medidas"

Var
a, b, c, area_quadrado, area_triangulo, area_trapezio : real
Inicio
      escreva("Digite a medida de A: ")
      leia(a)
      escreva("Digite a medidade de B: ")
      leia(b)
      escreva("Digite a medida de C: ")
      leia(c)
      
      area_quadrado <- a^2
      area_triangulo <- (a * b) / 2
      area_trapezio <- ((a + b) * c) / 2
      
      escreval("AREA DO QUADRADO = ", area_quadrado:8:4)
      escreval("AREA DO TRIANGULO = ", area_triangulo:8:4)
      escreva("AREA DO TRAPEZIO = ", area_trapezio:8:4)
      
Fimalgoritmo