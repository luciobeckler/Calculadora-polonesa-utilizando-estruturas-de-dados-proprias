package Fila;

public class Fila {
  CelulaFila primeiro;
  CelulaFila ultimo;

  Fila() {
    primeiro = new CelulaFila(-1);
    ultimo = primeiro;
    primeiro.proximo = null;
  }

  boolean vazia() {
    return (primeiro == null);
  }

  void enfilera(int elemento) {
    ultimo.proximo = new CelulaFila(elemento);
  }

}
