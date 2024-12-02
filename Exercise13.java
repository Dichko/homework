public class Exercise13 {
        public static void main(String[] args) {
            int n = 10;
            int[][] mass = new int[n][n];
            for (int i = 0; i < n; i++) {
                mass[i][i] = 1;
                mass[i][n - 1 - i] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


