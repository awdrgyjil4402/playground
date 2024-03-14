import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Dog dog = new Dog();

        dog.Adopt("dog", 3);
        dog.Bark(6, 4);
        dog.Fetch("Stick", false);
        dog.Run(5);
        dog.Random();


        ArrayList<String> NameArray = new ArrayList<String>();
        String name1 = "Bill";
        NameArray.add(name1);
        String name2 = "Bob";
        NameArray.add(name2);
        String name3 = "Joe";
        NameArray.add(name3);
        String name4 = "BobJoe";
        NameArray.add(name4);
        dog.Name(NameArray);

    }
}

class Dog {
    private String name;
    private int age;
    void Adopt (String aname, int anage) {
        System.out.println(name);
        name = aname;
        System.out.println(age);
        age = anage;
    }
    void Bark (int volume, int duration) {
        while (duration > 0) {
            if (volume < 5) {
                System.out.println("yipyip");
            } else {
                System.out.println("WOOF");
            }
            duration = duration - 1;
        }
    }
    boolean Fetch (String object, boolean returned) {
        if (returned == true) {
            System.out.println(name + " fetched " + object);
            return true;
        } else {
            System.out.println(name + " did not fetch " + object);
            return false;
        }
    }

    void Run (int steps){
        for (int x = 0; x < steps; x++){
            System.out.println("Run");
        }
    }

    void Random (){
        float randnum = ((float)(Math.random()) * 100);
        System.out.println((int) randnum);
    }

    void Name(List<String> namesarray) {
        for (String names : namesarray){
            System.out.println(names);
        }
        int size = namesarray.size();
        System.out.println(size);
    }
}