# [JAVA]
## DESAFIO
Construindo uma Api Rest com Spring Boot, Mysql para facilitar o gerenciamento de participantes de um curso. 
Capaz de: Armazenar dados cadastrais de participantes como: nome, data de nascimento, periodo, data de cadastro que calcula automaticamente de acordo com a data inserida.

### PARA CRIAR O PROJETO
Usei a IDE Spring Tool o para construir a API Rest com o auxilio da ferramenta Spring através do nhttps://start.spring.io/.
### AMBIENTE DE DESENVOLVIMENTO
1. Após clonar ou baixar o repositório 
> https://github.com/camillacleanne/avaliacao

2.Abrir o projeto no Spring toll / Eclipse e através do terminal executar a aplicação java;

3. Abrir o postman
Através da URL com o metodo **POST**:
> http://localhost:8080/participante
Fazer a verificação da população dos dados em:
Body>raw> JSON :
{
    "nome":"Vitoria",
    "dataNasc": "2021-05-16",
    "periodo": "manhã",
    "tipoCurso": "EAD"
}

4. No **GET** validar o input
5. A API não aceita cadastro de pessoas com idade maior de 18 anos.
6. Para mensagem de idade não permitida utilizei o tratamento de excessões; 

