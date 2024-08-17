import java.nio.channels.Pipe;

import Pilha.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha expressaoPolonesa = LeitorDeExpressoes.leDoTerminalEGeraPilha();
        ConversorExpressao conversorExpressao = new ConversorExpressao(expressaoPolonesa);
        conversorExpressao.ConverteExpressaoAPartirDaPilha();
    }
}
