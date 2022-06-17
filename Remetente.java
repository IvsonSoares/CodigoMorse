import java.util.ArrayList;

public class Remetente {

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

    private ArrayList<String> codificaMensagem(String mensagem){
        ArrayList<String> mensagemCodificada = new ArrayList<String>();

        mensagem = mensagem.toLowerCase();

        for(int i = 0; i < mensagem.length(); i++){
            for(int j = 0; j < this.getAlphabet().length; j++){
                if(mensagem.charAt(i) == this.getAlphabet()[j].charAt(0)){
                    int indice = (int) mensagem.charAt(i);
                    //chars
                    if(isBetween(indice, 97, 122)){
                        indice = indice - 97;
                    }
                    //numbers
                    else if(isBetween(indice, 48, 57)){
                        indice = (indice - 48) + 26;
                    }
                    String morse = this.getMorse()[indice];
                    mensagemCodificada.add(morse);
                }
            }
        }

        return mensagemCodificada;
    }

    public void enviaMensagem(String mensagem){
        ArrayList<String> mensagemCodificada = codificaMensagem(mensagem);
        for(int i = 0; i < mensagemCodificada.size(); i++){
            System.out.print(mensagemCodificada.get(i) + "|");
        }

        System.out.println();

        Destinatario.recebeMensagem(mensagemCodificada);
    }

    private String[] getMorse(){
        return this.morse;
    }

    private String[] getAlphabet(){
        return this.alphabet;
    }

    private static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
      }

        
}
