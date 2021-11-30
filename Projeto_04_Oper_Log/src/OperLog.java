public class OperLog {
    // método main inicia a execução do aplicativo
    public static void main(String[] args)
    {
        int v1 = 120;
        int v2 = 30;
        int v3 = 3;
        boolean res =  (v1-v2) == (v3^v2);
        System.out.println("Teste1: " + (true && false));
        System.out.println("Teste2: " + (true || false));
        System.out.println("Teste3: " + (!true));

        System.out.println("Ex.  3a: " + res );
        //System.out.println("Ex.  3a: " + ((v1-v2) == (v3^v2)) );
    } // fim do método main
} // fim da classe OperLog