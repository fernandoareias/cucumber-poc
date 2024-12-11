# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitacao

Cenário:Deve executar especificacao
  Dado que criei o arquivo corretamente
  Quando executa-lo
  Então a especificacao deve finalizar com sucesso



Cenário: Deve incrementar o contador
  Dado que o valor do contador é 15
  Quando eu incrementar em 3
  Então o valor do contador será 18

Cenário: Deve incrementar o contador
  Dado que o valor do contador é 20
  Quando eu incrementar em 5
  Então o valor do contador será 25

Cenário: Deve calcular atraso na entrega
  Dado que a entrega e no dia 05/04/2025
  Quando a entrega atrasar em 2 dias
  Então a entrega será efetuada em 07/04/2025

@EsseJob
Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é "Fulano da Silva"
    Dado que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar


  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    Dado que o ticket especial é AB167
    Dado que o valor da passagem é R$ 1120,23
    Dado que o nome do passageiro é "Cicrano de Oliveira"
    Dado que o telefone do passageiro é 9888-8888
