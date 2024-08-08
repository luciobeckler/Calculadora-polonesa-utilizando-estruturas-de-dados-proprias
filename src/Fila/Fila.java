package Fila;

import Celula.Variavel;
import Celula.Celula;
import Celula.Operando;

public class Fila {
  Celula frente;
  Celula tras;

  public Fila() {
    frente = new Variavel(-1.0);
    tras = frente;
    frente.prox = null;
  }

  boolean vazia() {
    return (frente == null);
  }

  void enfilera(Variavel elemento) {
    this.tras.prox = elemento;
    tras = tras.prox;
    this.tras.prox = null;
  }

  Celula desenfilerar() throws Exception {
    Celula item = null;
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
      Celula aux = frente.prox;
      while (aux != null) {
        System.out.println("\n\rElemento = " + aux.getValor());
        aux = aux.prox;
      }
    }
  }
}
