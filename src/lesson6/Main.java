package lesson6;
import ...
public class Main {
    public static void main(String[] args) {
       Animal[] animals={
               new Cat("Барсик");
               new Dog( "Тузик");
        new Cat("Тигр", maxRunDistance 1000, maxSwimDistance 100),
        new Dog("Хантер",maxRunDistance 2000, maxSwimDistance 150 ),

       };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(50);
            animals[i].swim(100);
        }
        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
