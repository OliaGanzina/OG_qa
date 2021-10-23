public class HW56 {
    public static void main(String[] args) {

        int a = -99;
        int b = 99;
        int[][] c = new int[5][8];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a + (int) (Math.random() * (b - a));
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
            int max = c[0][0];
            for (int i = 1; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    if (c[i][j] > max) {
                        max = c[i][j];
                    }
                }
            }
            System.out.println("Maximum array element: " + max);

    }
}