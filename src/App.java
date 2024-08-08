public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // LeitorDeExpressoes.leDoTerminalEGeraPilha(); Desenvolver depois
        ConversorExpressao conversorExpressao = new ConversorExpressao();
        conversorExpressao.ConverteExpressaoAPartirDaPilha();
    }
}
