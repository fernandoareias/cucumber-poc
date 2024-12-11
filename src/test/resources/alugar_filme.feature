# language: pt

Funcionalidade: Alugar Filme
  Como um usuário
  Eu quero cadastrar aluguéis de filmes
  Para controlar preços e datas de entrega

  Cenario: Deve alugar um filme com sucesso
    Dado um filme com estoque de 2 unidades
    E que o preço do aluguel seja R$ 3
    Quando alugar
    Então o preço do aluguel será R$ 3
    E a data de entrega será no dia seguinte
    E o estoque do filme será 1 unidade

  Cenario: Não deve alugar filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Então não será possível por falta de estoque
    E o estoque do filme será 0 unidade

  Esquema do Cenário: Deve dar condicoes conforme tipo de aluguel
    Dado um filme com estoque de 2 unidades
    E que o preço do aluguel seja R$ <preço>
    E que o tipo de aluguel seja <tipo>
    Quando alugar
    Então o preço do aluguel será R$ <valor>
    E a data de entrega será em <qntDias> dias
    E a pontuação será de <pontuação> pontos

    Exemplos:
      | preço | tipo      | valor | qntDias | pontuação |
      | 4     | extendido | 8     | 3       | 2         |
      | 4     | comum     | 4     | 1       | 1         |
      | 10    | extendido | 20    | 3       | 2         |
      | 5     | semanal   | 15    | 7       | 3         |


