package Celula;

public abstract class Celula {
  public Celula prox;

  public Celula() {
    this.prox = null;
  }

  public abstract void setValor(Object valor);

  public abstract Object getValor();
}