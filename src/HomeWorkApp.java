import java.util.Arrays;

public class HomeWorkApp {//создание класса

    public static void main(String[] args) { //метод main


        printThreeWords();
        checkSumSign();// название метода
        printColor(10);
        compareNumbers();
    }

    public static void printThreeWords() { // создание метода
        System.out.println("Orange"); // вывод в консольной панели
        System.out.println("Banana");
        System.out.println("Apple");


    }

    public static void checkSumSign() {
        int a = 15; // переменная а
        int b = -20; // переменная b
        int c = 0; // переменная с
        System.out.println(c); // вывод в консоль переменную с
        if (a < c && b > c) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 6;
        int b = 9;
if(a>=b) {
    System.out.println("a>=b");
} else  {
    System.out.println("a<b");
}
pub
    }
}
























