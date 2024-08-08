import Pilha.Pilha;
import Celula.Variavel;
import Fila.Fila;
import Celula.Celula;
import Celula.Operando;

public class ConversorExpressao {

  public void ConverteExpressaoAPartirDaPilha() {
    Pilha pilha = mockarPilha();
    pilha.exibir();

    System.err.println("\n" + converteExpressao(pilha));

  }

  private String converteExpressao(Pilha pilha) {
    Fila fila = new Fila();

    while (!pilha.vazia()) {
      Celula topo = pilha.desempilhar();

    }

    return null;

  }

  private Pilha mockarPilha() {
    Pilha pilha = new Pilha();

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
