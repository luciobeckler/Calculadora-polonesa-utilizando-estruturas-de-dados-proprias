package Fila;

public class Fila {
  CelulaFila frente;
  CelulaFila tras;

  public Fila() {
    frente = new CelulaFila(-1);
    tras = frente;
    frente.prox = null;
  }

  boolean vazia() {
    return (frente == null);
  }

  void enfilera(CelulaFila elemento) {
    this.tras.prox = elemento;
    this.tras = tras.prox;
    this.tras.prox = null;
  }

  CelulaFila desenfilerar() throws Exception {
    CelulaFila item = null;
    if (vazia()) {
      throw new Exception("Erro: A fila está vazia");
    }

    item = frente.prox;
    frente.prox = item.prox;
    if (frente.prox == null) {
      tras = frente;
    }

    return item;
  }

  void exibir() {
    if (vazia()) {
      System.out.println("Fila vazia");
    } else {
      CelulaFila aux = frente.prox;
      while (aux != null) {
        System.out.println("\n\rElemento = " + aux.valor);
        aux = aux.prox;
      }
    }
  }
}
