import Pilha.Pilha;
import Celula.Variavel;
import Fila.Fila;

import Celula.Celula;
import Celula.Operando;

public class ConversorExpressao {
  private String expressao = "";
  private Pilha pilha = mockarPilha();

  public static void main(String[] args) throws Exception {
    ConversorExpressao conversor = new ConversorExpressao();
    conversor.ConverteExpressaoAPartirDaPilha();
  }

  public void ConverteExpressaoAPartirDaPilha() throws Exception {
    // Iniciar o processo de conversão e cálculo
    double resultado = geraExpressao();
    System.out.println("Expressão Infixa: " + expressao);
    System.out.println("Resultado: " + resultado);
  }

  public double geraExpressao() {
    Celula topoPilha = pilha.desempilhar();

    if (topoPilha instanceof Variavel) {
      // Se for uma variável (número), retorne o valor e acrescente à expressão
      double valor = ((Variavel) topoPilha).getValor();
      expressao += valor;
      return valor;
    } else if (topoPilha instanceof Operando) {
      // Se for um operador, precisamos calcular as duas sub-expressões
      String operador = String.valueOf(topoPilha.getValor());

      // Como estamos desempilhando de uma pilha, o segundo operando vem antes do
      // primeiro
      double operando2 = geraExpressao();
      double operando1 = geraExpressao();

      // Constrói a expressão na notação infixa
      expressao = "(" + operando1 + " " + operador + " " + operando2 + ")";

      // Realiza a operação
      switch (operador) {
        case "+":
          return operando1 + operando2;
        case "-":
          return operando1 - operando2;
        case "*":
          return operando1 * operando2;
        case "/":
          return operando1 / operando2;
        default:
          throw new IllegalArgumentException("Operador desconhecido: " + operador);
      }
    }

    return 0;
  }

  private Pilha mockarPilha() {
    Pilha pilha = new Pilha();

    // Exemplo de expressão: 5 9 3 + 4 2 * * 7 + *
    pilha.empilhar(new Variavel(5.0));
    pilha.empilhar(new Variavel(9.0));
    pilha.empilhar(new Variavel(3.0));
    pilha.empilhar(new Operando("+"));
    pilha.empilhar(new Variavel(4.0));
    pilha.empilhar(new Variavel(2.0));
    pilha.empilhar(new Operando("*"));
    pilha.empilhar(new Operando("*"));
    pilha.empilhar(new Variavel(7.0));
    pilha.empilhar(new Operando("+"));
    pilha.empilhar(new Operando("*"));

    return pilha;
  }
}