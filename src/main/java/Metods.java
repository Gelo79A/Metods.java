public class Metods {
    public static void main(String[] args) {
       System.out.println(sum(11, 5));
        printPositiveOrNegativeNumber(-9);
        System.out.println(positiveNegativeNumber(2));
        printString("Hello1", 2);
        printString2("Hello2", 3);
        leapNon_leapYear(800);

    }
    /*1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
     от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
public  static boolean sum (int a, int b) {
if (a + b >=10 && a + b <= 20) {
    return  true;
}
else {
    return false;
}
}

/*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
 положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
public static void printPositiveOrNegativeNumber (int a) {
    if (a < 0) {
        System.out.println("Вы передали отрицательное число");
    }
    else {
        System.out.println("Вы передали положительное число");
    }
}

/*3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
     если число отрицательное, и вернуть false если положительное.
     */
public static boolean positiveNegativeNumber(int number) {
    if (number < 0) {
        return true;
    }
    else return false;
    // а если 0, тогда как?
}

/*4. Написать метод, которому в качестве аргументов передается строка и число,
 метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */

    public static void printString (String string, int number) {
        int i = 0;
        while (i < number){
            System.out.println(string);
            i++;
        }

    }

    public  static  void printString2 (String string, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }
    /*5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
     Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
public static void leapNon_leapYear (int year) {


    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

        System.out.println("Год  високосный");
    }
    else {
        System.out.println("Год не високосный");
    }


}




}
