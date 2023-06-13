[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=10121213)
# Estoque
Nosso projeto tem o objetivo de automatizar a gestão de estoque de um sistema de uma mercearia.

## Nota base do grupo: 11

A nota final, que é individual, se dará pela nota acima, multiplicada por um peso entre 0 e 1 relativo ao acompanhamento semanal do projeto. Lembre-se: não é só a entrega do produto finalizado que importa, é todo o processo de sua construção e as entregas parciais para o “cliente”.

## Comentários

### Diagrama + aderência das classes ao diagrama: 1,75 /2 pontos 
Inconsistência Classe Estoque - vetor de produtos, calcularValorVendido, valorGastoReposicao


### Requisitos corretamente implementados: 4,75 /6 pontos 
	- produto (preço, estoque) - 1,75 / 2
	Não entendi porque recebem parâmetro no método setValorImpostos()

	- estoque (valor, abaixo do estoque) - 1,5 / 2
	O método reporEstoque() deveria atualizar automaticamente a quantidade atual
	O método retirarDoEstoque() deveria atualizar automaticamente a quantidade atual


	- sistema (vender, comprar, consultas) - 1,5 / 2
	1 - Vender produto
	2 - Fazer pedido de reposição de produto
		Não calcula estoque abaixo do minimo
	3 - Consultar dados de um produto
	4 - Consultar dados do estoque
		Não permite visualizar os dados de cada um dos produtos
	5 - Calcular e exibir o balanço da empresa
	6 - Cadastrar produto
	7 - Sair





### Documentação de código:  1,5 pontos 
	Documentação não existente na classe Produto e nos testes

	
### Testes (quantidade e qualidade): 3/4 pontos 
	Criaram o plano de teste

	- produto: 1,75/2 pontos
	Não é recomendado criar mais de 1 assert por @test
	Não os testes que vocês utilizam o setValorImpostos()


	
	- estoque: 1,25/2 pontos
	O que esta senda testado neste método testProdutosComEstoqueBaixo()?
	O método reporEstoque() deveria atualizar automaticamente a quantidade atual
	O método retirarDoEstoque() deveria atualizar automaticamente a quantidade atual
	Não testaram estoque abaixo do mínimo, produtos que constam do estoque, valor total do estoque atual
	Não é recomendado criar mais de 1 assert por @test
	



## Alunos integrantes da equipe

* Juliana Serra Camargo Gomes
* Luana Fleury Braz
* Guilherme da Silveira Cantoni
* Victor de Souza Friche Passos
* Vítor de Figueiredo Pereira

## Professores responsáveis

* Cleiton Silva Tavares
* João Caram Santos de Oliveira

