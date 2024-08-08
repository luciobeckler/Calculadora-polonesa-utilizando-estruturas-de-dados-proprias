/*
 * import java.util.Scanner;
 * 
 * import ListaSEC.Celula;
 * import Pilha.CelulaPilha;
 * import Pilha.Pilha;
 * 
 * public class LeitorDeExpressoes {
 * public static void leDoTerminalEGeraPilha() {
 * 
 * Scanner scanner = new Scanner(System.in);
 * System.out.println("Digite a expressão na notação polonesa inversa: ");
 * String linha = scanner.nextLine();
 * System.out.println("Você digitou: " + linha);
 * 
 * quebraLinhaEGeraPilha(linha);
 * 
 * }
 * 
 * public static Pilha quebraLinhaEGeraPilha(String linha) {
 * String[] elementos = linha.split(" ");
 * Pilha pilha = new Pilha();
 * 
 * for (String elemento : elementos) {
 * CelulaPilha celulaPilha = new CelulaPilha(elemento);
 * pilha.empilhar(celulaPilha);
 * }
 * 
 * pilha.exibir();
 * 
 * return pilha;
 * 
 * }
 * }
 */