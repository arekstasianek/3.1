public class Main {

    public static void main(String[] args) {
        int wysokosc = 5;

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        
        for (int i = 0; i < wysokosc; i++) {
            for (int j = wysokosc - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

