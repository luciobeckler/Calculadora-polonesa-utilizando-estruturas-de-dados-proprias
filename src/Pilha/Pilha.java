package Pilha;

import Celula.Celula;
import Celula.Variavel;

public class Pilha {

  public Celula topo;
  int tamanho;

  public Pilha() {
    topo = null;
    tamanho = 0;
  }

  public boolean vazia() {
    return (topo == null);
  }

  public void empilhar(Celula elemento) {
    elemento.prox = topo;
    topo = elemento;
    tamanho++;
  }

  public Celula desempilhar() {
    if (vazia()) {
      System.out.println("Pilha vazia");
      return null;
    } else {
      Celula aux = topo;
      topo = topo.prox;
      tamanho--;
      return aux;
    }
  }

  public void esvaziar() {
    topo = null;
  }

  public void exibir() {
    if (vazia()) {
      System.out.println("Pilha vazia");
    } else {
      Celula aux = topo;
      while (aux != null) {
        System.err.println("Elemento = " + aux.getValor());
        aux = aux.prox;
      }
    }
  }
}
