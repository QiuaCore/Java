public class Ativ22 {
    public static void main(String[] args) {
        int n = 9; boolean primo = true; // boleano neste caso, define primo como true, para verifição posterior se o mesmo se mantém primo

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) { // método Math.sqrt ira retornar a raiz quadrada positiva da variável
                if (n % i == 0) { // ele pega a sobra da raiz quadrada e verifica se ainda é primo
                    primo = false;
                    break;
                }
            }
        }
        System.out.println(n + " é primo? " + primo);
    }
}
