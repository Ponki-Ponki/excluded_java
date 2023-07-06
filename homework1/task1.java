package homework1;

public class task1 {
    /*
     * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
     */
    public static void main(String[] args) {
        err1();
        err2(null);
        err3(1);
    }

    static void err1() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i == 9)
                System.out.println(arr[i + 1]);
        }
    }

    static void err2(Integer a) {
        Integer b = 5;
        System.out.println(a - b);
    }

    static void err3(int x) {
        Integer a = 5;
        System.out.println(a / x);
    }
}
