// 1. Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the
// "Person" class, set their attributes using the constructor, and print their name and age.
class Person {
    private  String name;
    private int age; // int -> Integer, long -> Long
    private static String adress;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        adress = "Place Square";
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public static void setAdress(String adress) {
        Person.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", adress=" + adress +
                '}';
    }
}


class Test {
    public static void main (String[] args) {
        Person bill = new Person("Bill", 5);
        Person bob =  new Person ("Bob", 3);
        System.out.println(bill);
        System.out.println(bob);
        Person.setAdress("Square Place");

        System.out.println(bill);
        System.out.println(bob);
    }
}
