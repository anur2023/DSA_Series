public class Square2 {
    public static void main(String[] args) {
        int n = 5; // Size of the square
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
