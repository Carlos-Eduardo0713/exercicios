Algoritmo "Exercício duração"

Var
duracao_segundos, horas, resto_horas, minutos, segundos : inteiro
Inicio
escreva("Digite a duração em segundos: ")
leia(duracao_segundos)

horas <- duracao_segundos \ 3600
resto_horas <- duracao_segundos % 3600
minutos <- resto_horas \ 60
segundos <- duracao_segundos % 60

escreva(horas,":",minutos,":",segundos)
Fimalgoritmo