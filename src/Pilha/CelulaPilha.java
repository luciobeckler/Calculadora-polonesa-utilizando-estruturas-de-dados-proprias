package Pilha;

public class CelulaPilha {

  double valor;
  CelulaPilha prox;

  CelulaPilha(double valor) {
    this.valor = valor;
    this.prox = null;
  }
}
