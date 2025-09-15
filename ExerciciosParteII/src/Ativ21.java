public class Ativ21 {
    public static void main(String[] args) {
        int n = 5, fatorial = 1, i = n; // i = n segura valor original
        while (n > 1) {
            fatorial = fatorial * n; // Multiplica o valor de n até reduzir ao máximo
            n = n - 1; // Ele vai reduzindo o valor de n em um, lógica fatorial
        }
        System.out.println(i + "! = " + fatorial);
    }
}