package lessonn5;

public class Sotrudnik {

    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
   /// public String name;
  ///  public String position;
 ///   public String email;
  //  public String phone;
  ///  public String salary;
 //   public int age;


  //  public void info() {
 //       System.out.printf("Sotrudnik: %s %s %s %s %s %d\n", name, position, email, phone, salary, age);
 //   }
 //     }
private String name;
p5урок доработкаrivate String position;
private String email;
private int phone;
private int salary;
private int age;

public sotrudniki (String fio, String position, String email, String phone, String salary, String age){
    this.name=fio;
    this.position=position;
    this.email=email;
    this.phone=phone;
    this.salary=salary;
    this.age=age;
}
public void printFullInfo(){
    System.out.println ("fio:"+name+",position:"+position+", email:"+email+", phone:"+phone+",salary:"+salary+",age:"+age+");
}

    int getAge() {
        return age;
    }
}
