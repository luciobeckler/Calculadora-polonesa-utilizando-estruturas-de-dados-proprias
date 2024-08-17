import Pilha.Pilha;
import Celula.Variavel;
import Fila.Fila;

import Celula.Celula;
import Celula.Operando;

public class ConversorExpressao {
  private String expressao = "";
  private Pilha pilha;

  public ConversorExpressao(Pilha pilhaExpressao) {
    pilha = pilhaExpressao;
  }

  public void ConverteExpressaoAPartirDaPilha() throws Exception {
    // Iniciar o processo de conversão e cálculo
    double resultado = geraExpressao();
    System.out.println("Expressão Infixa: " + expressao + " = " + resultado);
  }

  public double geraExpressao() {
    Celula topoPilha = pilha.desempilhar();

    if (topoPilha instanceof Variavel) {
      double valor = ((Variavel) topoPilha).getValor();
      expressao = expressao.concat(String.valueOf(valor));
      return valor;
    } else if (topoPilha instanceof Operando) {
      expressao = expressao.concat("(");

      double operando1 = geraExpressao();

      String operador = String.valueOf(topoPilha.getValor());
      expressao = expressao.concat(operador);

      double operando2 = geraExpressao();

      expressao = expressao.concat(")");

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

  private Pilha mockPilha() {
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