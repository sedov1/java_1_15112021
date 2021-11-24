public class HomeWorkApp2 {


    public static void main(String[] args) {
         methodA();
         methodD();


        int x = 10;
        int y = 5;

        if ((x + y) > 10 && (x + y) < 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    public static void methodA() {
        int a = -4;
        if (a < 0) {
            System.out.println("Число отрицательное.");
        } else {
            System.out.println("Число положительное.");

        }
    }

    public static boolean methodD() {
        int a = 6;
        if (a < 0) {
            return true;
        } else {
            return false;
        }

    }

       }








