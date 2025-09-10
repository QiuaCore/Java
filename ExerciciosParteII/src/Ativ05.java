public class Ativ05 {
    public static void main(String[] args) {
        int a = 8; int b = 16; int c = 32;

        int somatoria = a + b + c;
        int media = somatoria / 3;

        if (media % 2 == 0) {
            System.out.println("Média: " + media + " (Par)");
        } else {
            System.out.println("Média: " + media + " (Impar)");
        }
    }
}