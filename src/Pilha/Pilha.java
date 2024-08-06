package Pilha;

public class Pilha {

  CelulaPilha topo;
  int tamanho;

  boolean vazia() {
    return (topo == null);
  }

  void empilhar(CelulaPilha elemento) {
    elemento.prox = topo;
    topo = elemento;
    tamanho++;
  }

  CelulaPilha desempilhar() {
    if (vazia()) {
      System.out.println("Pilha vazia");
      return null;
    } else {
      CelulaPilha aux = topo;
      topo = topo.prox;
      tamanho--;
      return aux;
    }
  }

  void esvaziar() {
    topo = null;
  }

  void exibir() {
    if (vazia())
      System.out.println("Pilha vazia");
    else {
      CelulaPilha aux = topo;
      while (aux != null) {
        System.out.println(aux.valor);
        aux = aux.prox;
      }
    }
  }
}
