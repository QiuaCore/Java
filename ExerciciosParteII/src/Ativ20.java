public class Ativ20 {
    public static void main(String[] args) {
        int n = 5, i =1;
        int resultado = (n * i);

        do {
            resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
            i++;
        } while (i <= 10);
        
    }
}