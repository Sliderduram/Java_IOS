import java.util.Locale;

public class QtdeLetras {
    public static void main(String[] args) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
        //char letrasCont[] = new char[letras.length()];
        int contador[] = new int[letras.length()];
        String texto = "Teste do texto para contagem de letras";
        String textoCA = texto.toUpperCase();
        int i, j, l, z;

        // inicializa contadores das letras com zero
        for (j = 0; j < contador.length; j++){
            contador[j] = 0;
        }

        for (i = 0; i < textoCA.length(); i++){
            for (z = 0; z < letras.length(); z++){
                if(textoCA.charAt(i) == letras.charAt(z)){
                    contador[z]++;
                }
            }

        }

        for (l = 0; l < letras.length(); l++){
            System.out.println(letras.charAt(l) + " - " + contador[l]);
        }


    }
}
