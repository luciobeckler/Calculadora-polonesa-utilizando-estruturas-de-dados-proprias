import java.util.Scanner;

import Celula.Operando;
import Celula.Variavel;
import Pilha.Pilha;

public class LeitorDeExpressoes {
  public static Pilha leDoTerminalEGeraPilha() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a expressão na notação polonesa inversa: ");
    String linha = scanner.nextLine();
    System.out.println("Você digitou: " + linha);

    Pilha pilha = quebraLinhaEGeraPilha(linha);
    scanner.close();
    return pilha;
  }

  public static Pilha quebraLinhaEGeraPilha(String linha) {
    String[] elementos = linha.split(" ");
    Pilha pilha = new Pilha();

    for (String elemento : elementos) {
      if (elemento.equals("*") ||
          elemento.equals("/") ||
          elemento.equals("+") ||
          elemento.equals("-")) {

        Operando operando = new Operando(elemento);
        pilha.empilhar(operando);
      } else {
        try {
          double valor = Double.parseDouble(elemento);
          Variavel variavel = new Variavel(valor);
          pilha.empilhar(variavel);
        } catch (NumberFormatException e) {
          throw new NumberFormatException("Número " + String.valueOf(elemento) + "invalido");
        }
      }
    }

    return pilha;
  }
}