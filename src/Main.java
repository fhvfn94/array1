import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //example();
        //task1();
        //task2();
        task3();
    }
    public static void example(){
        int[] weights = new int[12];
        weights[0] = 90;
        System.out.println(weights[0]);
        for (int i = 0; i < 12; i++) {
            System.out.println(weights[0]);
        }
        int[] b = new int[10];
        System.out.println(b.length);
    }
    public static void task1(){
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        boolean[] arr3 = new boolean[2];
        arr3[0] = true;
        System.out.println(Arrays.toString(arr3));

    }
    public static void task2(){
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (arr1.length > arr1[i]){
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (arr2.length - 1 == i){
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] arr3 = new int[2];
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (arr3.length - 1 == i){
            } else {
                System.out.print(", ");
            }

        }
        System.out.println();
    }
    public static void task3() {
        int[] arr1 = {1, 2, 3};
        for (int i = arr1.length - 1; i >= 0; i--) {
                System.out.print(arr1[i]);
                if (arr1.length - 1 >= i){
                    System.out.print(", ");
                }
        }
        System.out.println();
        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (arr2.length - 1 >= i){
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] arr3 = new int[2];
        arr3[0] = 20;
        arr3[1] = 10;
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (arr3.length - 1 > i){
                System.out.print(", ");
            }
            System.out.print(arr3[i]);
        }
        System.out.println();
    }
}