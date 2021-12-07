package lesson6;

public class Cat extends Animal{
    private static int count;
    public Cat (String name,int maxRunDistance, maxSwimDistance){
        super(name,type"Кот", maxRunDistance, maxSwimDistance);
        count++;
    }
    public Cat (String name){
        super(name,type"Кот", maxRunDistance 200,maxSwimDistance 0);
        count++;

    }
    public static int getCount(){
        return count;
    }
}

}

