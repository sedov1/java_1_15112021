package lesson6;

public class Dog extends Animal {
    private static int count;
    public Dog (String name,int maxRunDistance,maxSwimDistance){
        super(name,type"Собака", maxRunDistance,maxSwimDistance);
        count++;
    }
public Dog (String name){
    super(name,type"Собака", maxRunDistance 500,maxSwimDistance 200);
    count++;

}
public static int getCount(){
        return count;
}
}
