package Celula;

public class Variavel extends Celula {
  Double valor;

  public Variavel(Double dado) {
    valor = dado;
  }

  public Double getValor() {
    return this.valor;
  }

  public void setValor(Object dado) {
    this.valor = (Double) valor;
  }
}