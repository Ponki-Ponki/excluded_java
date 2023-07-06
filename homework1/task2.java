package homework1;

import java.util.Random;

public class task2 {
    static Random random = new Random();

    /*
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных
     * массива, и возвращающий новый массив, каждый элемент которого равен 
     * разности элементов двух входящих массивов в той же ячейке. Если длины
     * массивов не равны, необходимо как-то оповестить пользователя
     */
    public static void main(String[] args) {
        // Integer[] a = createArray(9); // Для вывода ошибки
        Integer[] a = createArray(10);
        printArr(a);
        Integer[] b = createArray(10);
        printArr(b);
        Integer[] answer = arrDiff(a, b);
        if (answer.length == 0)
            System.out.println("Нельзя найти разность. Массивы не равны по длине");
        printArr(answer);
    }

    static void printArr(Integer[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static Integer[] createArray(int l) {
        Integer[] result = new Integer[l];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(10);
        }
        return result;
    }

    static Integer[] arrDiff(Integer[] a, Integer[] b) {
        if (a.length != b.length)
            return new Integer[0];
        Integer[] result = new Integer[a.length];
        for (int i = 0; i < b.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
}
