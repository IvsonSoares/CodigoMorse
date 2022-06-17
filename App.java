public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Remetente remetente = new Remetente();
        Destinatario destinatario = new Destinatario();

        remetente.enviaMensagem("helloWorld");

        
        destinatario.printaMensagem();

    }
}
