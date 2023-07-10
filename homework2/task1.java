package homework2;

import java.util.Scanner;

/**
 * task1
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и 
 * возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
 * приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class task1 {

    public static void main(String[] args) {
        System.out.println(requestFloat());
    }

    static Float requestFloat(){
        Scanner scan = new Scanner(System.in);
        Float result = null;
        Boolean bool = true;
        try {
            while (bool){
            System.out.println("Pleas input number type float:");
            if (scan.hasNextFloat()) result = scan.nextFloat();
            scan.nextLine();
            if (result instanceof Float){
                bool = false;
            }
        }
        } catch (Exception e) {
            System.out.printf("Error  %s",e);
        }
        scan.close();
        return result;
    } 

}