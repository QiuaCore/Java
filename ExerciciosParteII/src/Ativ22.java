public class Ativ22 {
    public static void main(String[] args) {
        int n = 9; boolean primo = true; //

        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        System.out.println(n + " é primo? " + primo);
    }
}