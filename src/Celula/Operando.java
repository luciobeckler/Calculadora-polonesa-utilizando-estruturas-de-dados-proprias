package Celula;

public class Operando extends Celula {
  String valor;

  public Operando(Object dado) {
    valor = (String) dado;
  }

  public String getValor() {
    return this.valor;
  }

  public void setValor(Object dado) {
    this.valor = (String) valor;
  }
}
