import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 7.");
        System.out.println("Задача 1.");
        int[] book = new int[]{1, 2, 3};
        float[] weigths = new float[]{1.57f, 7.654f, 9.986f};
        long[] ants = new long[]{250_000_000L, 6_000_000_000L,};
        System.out.println("Задача 2 .");
        for (int y = 0; y < book.length; y++) {
            System.out.print(book[y] + ",");
        }
        System.out.println(" ");

        for (int u = 0; u < weigths.length; u++) {
            System.out.print(weigths[u] + ",");
        }
        System.out.println(" ");
        for (int y = book.length - 1; y >= 0; y--) {

            System.out.print(book[y] + "," + " ");
        }
        System.out.println(" ");
        for(int t =weigths.length-1;t>=0;t--) {

            System.out.print(weigths[t] + ",");
        }

        System.out.println(" ");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; arr.length > i; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
                System.out.println(Arrays.toString(arr));

            }
        }

    }
}
