package lesson02;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][][] c =
                {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                { {10,11,12,13} },
                { {33,44}, {55,66}},
                {}
                };
        {
//        a[0];
//        a[1];
//        a[3];
            System.out.println(b[0][0]);
            System.out.println(b[0][1]);
        }
        System.out.println(c.length);
        int[][] d = c[0];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for (int k = 0; k < c[i][j].length; k++) {
                    System.out.printf("%d ", c[i][j][k]);
                }
                System.out.println("  ");
            }
            System.out.print("  ");
        }
    }
}
