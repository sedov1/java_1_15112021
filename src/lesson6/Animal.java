package lesson6;

public class Animal {
    String name;
    String type;
    public static int count;

    int maxRunDistance; /// переменная бега
    int maxSwimDistance;/// переменная плавания

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance){//конструктор имя тип и параметры
        this.name=name;//конструктор
        this.type=type;//конструктор
        this.maxRunDistance=maxRunDistance;//конструктор
        this.maxSwimDistance=maxSwimDistance;//конструктор
        count++;//конструктор

    }
    public void run (int dist) {/// метод бег
        if (maxRunDistance == 0) {
            System.out.printf("%s,%s не умеет бегать\n", type, name);
            return;
        }
        if (dist < 0) { /// метод бег
            System.out.println("Для бега в обратном направлении введите положительное число");
            return;
        }
        if (dist <= maxRunDistance) {
            System.out.printf("%s %s успешно пробежал %d метров\n", type, name, dist);
        } else {
            System.out.println("%s %s не смог пробежать %d метров \n", type, name, dist);
        }
    }
    public void swim (int dist) {/// метод плавать
        if (maxSwimDistance == 0) {
            System.out.printf("%s,%s не умеет плавать\n", type, name);
            return;
        }
        if (dist < 0) { /// метод плавать
            System.out.println("Для плавания в обратном направлении введите положительное число");
            return;
        }
        if (dist <= maxSwimDistance) {//метод плавать
            System.out.printf("%s %s успешно проплыл %d метров\n", type, name, dist);
        } else {
            System.out.println("%s %s не смог проплыть %d метров\n", type, name, dist);
        }
    }

public static int getCount(){
    return count;
    }
}

