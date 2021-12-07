package lessonn5;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

public class main {
    public static void main(String[] args) {
        ///    Sotrudnik sotrudnik1 = new Sotrudnik();
        /////     sotrudnik1.name = "Попов Виктор Анатольевич";
        /////     sotrudnik1.position = "Бухгалтер";
        ////      sotrudnik1.email = "нет";
        ////     sotrudnik1.salary = "450р";
        ////     sotrudnik1.phone = "296457892";
        ////     sotrudnik1.age = 32;

        ///    sotrudnik1.info();

        ////      Sotrudnik sotrudnik2 = new Sotrudnik();
        ////      sotrudnik2.name = "Камека Виктор Анатольевич";
        ////     sotrudnik2.position = "Директор";
        ////      sotrudnik2.email = "нет";
        ///      sotrudnik2.salary = "650р";
        ///      sotrudnik2.phone = "296457882";
        ///       sotrudnik2.age = 35;
        ///       sotrudnik2.info();

        Sotrudnik[] sotrudniki = new Sotrudnik[2];

        sotrudniki[1] = new Sotrudnik(fio:"Ivanchik Andrei", position: "director", email: "gffg@mail.ru", salary:450, phone:3752564522, age:36);
        sotrudniki[2] = new Sotrudnik(fio:"Ivanchik Anton", position: "buchgalter", email: "gffg@mail.ru", salary:350,
        "350$", phone:752564522, age:50);

        for (int i = 0; i < sotrudniki.length; i++) {
            if (sotrudniki[i].getAge() > 40) {
                sotrudniki[i].printFullInfo();

            }
        }
    }
}