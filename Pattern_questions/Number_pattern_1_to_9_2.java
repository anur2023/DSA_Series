public class Number_pattern_1_to_9_2 {
    public static void main(String[] args) {
        int n = 3; // Size of the pattern
        int var = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(var + " ");
                var--;
            }
            System.out.println();
        }
    }
}
