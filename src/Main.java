import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 7.");
        System.out.println("Задача 1.");
        int[] book = new int[]{1, 2, 3};
        float[] weigths = new float[]{1.57f, 7.654f, 9.986f};
        long[] ants = new long[]{250_000_000L, 6_000_000_000L,};
        System.out.println("Задача 2 .");
        System.out.print(book[0] + ",");
        System.out.print(book[1] + ",");
        System.out.print(book[2] + "");
        System.out.println(" ");
        System.out.print(weigths[0] + ",");
        System.out.print(weigths[1] + ",");
        System.out.print(weigths[2] + "");
        System.out.println(" ");
        System.out.print(ants[0] + ",");
        System.out.print(ants[1] + "");
        System.out.println(" ");
        System.out.print(book[2] + ",");
        System.out.print(book[1] + ",");
        System.out.print(book[0] + "");
        System.out.println(" ");
        System.out.print(weigths[2] + ",");
        System.out.print(weigths[1] + ",");
        System.out.print(weigths[0] + "");
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

