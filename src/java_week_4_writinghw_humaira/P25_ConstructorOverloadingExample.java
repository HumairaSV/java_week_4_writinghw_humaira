package java_week_4_writinghw_humaira;

public class P25_ConstructorOverloadingExample {
    int id;
    String name;
    int age;

    //creating two arg constructor
    P25_ConstructorOverloadingExample(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    P25_ConstructorOverloadingExample(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        P25_ConstructorOverloadingExample s1 = new P25_ConstructorOverloadingExample(111, "Karan");
        P25_ConstructorOverloadingExample s2 = new P25_ConstructorOverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
