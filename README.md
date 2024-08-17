# Calculadora polonesa inversa - Java

Este projeto foi fornecido pela professora Kênia Carolina como meio para obtenção de pontos para a matéria de Programação III e como forma de exercitar os conhecimentos sobre estruturas de dados, com foco principal em pilhas, listas e filas.

Ele tem por objetivo desenvolver uma calculadora utilziando a notação polonesa inversa, de forma que o usuário digite a expressão nesta notação e o programa faça a conversão para a notação convencional e a exiba juntamente com o resultado da operação.

## Notação polonesa inversa
" Notação Polonesa Inversa ou Reverse Polish Notation (RPN), os operadores
seguem seus operandos.
Por exemplo, a operação matemática 1+2×3 é escrita como 1+2*3 na notação
tradicional e como 1 2 3 * + na notação polonesa inversa. Curiosamente, o
fatorial de um número é escrito na forma polonesa inversa, fatorial de 12 é 12!"

[Entenda mais sobre a notação polonesa inversa](https://rudamoura.com/PolonesaInversa.pdf)

## Lógica de execução
Para entregar a tarefa precisamos cumprir dois pontos:

- Entregar o resultado:
- Entregar a expressão na notação convencional:

Os elementos eram armazenados em uma pilha começando do primeiro digitado até o último, sendo que durante a retirada para realizar as operações, os últimos elementos eram retirados primeiro. Nesta retirada o algoritmo avalia se o número é um "Operando" ou uma "Variável", no primeiro caso ele abre outra chamada recursiva adiciando mais um parênteses, no segundo caso ele resolve a chamada recursiva chamada, retornando um número, fazendo disto sua condição de parada, assim como é exibido na imagem a baixo.

![image](https://github.com/user-attachments/assets/20b17836-17a0-46b1-8802-229a7ddada1f)
