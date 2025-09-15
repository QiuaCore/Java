public class Ativ22 {
    public static void main(String[] args) {
        int n = 9; boolean primo = false; //

        if (n <= 1) {
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    break;
                }
            }
        }
        System.out.println(n + " é primo? " + primo);
    }
}