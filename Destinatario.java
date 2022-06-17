import java.util.ArrayList;

public class Destinatario {

    private String[] morse = 
    { 
      ".-", "-...", "-.-.", "-..",  ".", "..-.", "--.", "....", "..", 
      ".---","-.-", ".-..","--",  "-.",  "---", ".--.","--.-",".-.", 
      "...", "-", "..-", "...-",".--", "-..-","-.--","--..",".----", 
      "..---","...--","....-",".....","-....","--...","---..",
      "----.","-----"
    };
    private String[] alphabet = 
    {
        "a","b","c","d","e","f","g","h","i","j","k","l",
        "m","n","o","p","q","r","s","t","u","v","w","x",
        "y","z","0","1","2","3","4","5","6","7","8","9"
    };

    private static ArrayList<String> mensagemCodificada;

    public static void recebeMensagem(ArrayList<String> mensagem){
        Destinatario.mensagemCodificada = mensagem;
    }

    private ArrayList<String> traduzMensagem(ArrayList<String> mensagem){
        ArrayList<String> mensagemTraduzida = new ArrayList<String>();

        for(int i = 0; i < mensagem.size(); i++){
            for(int j = 0; j < this.getMorse().length; j++){
                if(mensagem.get(i) == this.getMorse()[j]){
                    mensagemTraduzida.add(this.getAlphabet()[j]);
                }
            }
        }

        return mensagemTraduzida;
    }

    public void printaMensagem(){
        ArrayList<String> mensagem = traduzMensagem(Destinatario.mensagemCodificada);

        for(int i = 0; i < mensagem.size(); i++){
            System.out.print(mensagem.get(i));
        }

    }

    private String[] getMorse(){
        return this.morse;
    }

    private String[] getAlphabet(){
        return this.alphabet;
    }
}
