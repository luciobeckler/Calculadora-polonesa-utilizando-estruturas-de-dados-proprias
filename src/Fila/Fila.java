package Fila;

import Celula.Variavel;
import Celula.Celula;

public class Fila {
  Celula frente;
  Celula tras;

  public Fila() {
    frente = new Variavel(-1.0);
    tras = frente;
    frente.prox = null;
  }

  public boolean vazia() {
    return (frente == null);
  }

  public void enfilera(Celula elemento) {
    this.tras.prox = elemento;
    tras = tras.prox;
    this.tras.prox = null;
  }

  public Celula desenfilerar() {
    Celula item = null;
    if (vazia()) {
      System.out.println("Fila vazia");
      return null;
    }

    item = frente.prox;
    frente.prox = item.prox;
    if (frente.prox == null) {
      tras = frente;
    }

    return item;
  }

  public void exibir() {
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
