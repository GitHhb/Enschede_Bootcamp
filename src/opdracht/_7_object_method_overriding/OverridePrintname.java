package opdracht._7_object_method_overriding;

public class OverridePrintname {
    public static void main(String[] args) {
        // roep method printname in class Animal aan
        new Animal().printname();

        // print de naam van de "Dog"
        new Dog().printname();

        // print de naam van de "Cat"
        new Cat().printname();
    }
}

class Animal {
    void printname() {
        System.out.println("I have no name yet.");
    }
}

class Dog extends Animal {
    void printname() {
        System.out.println("My name is Brutus.");
    }
}

class Cat extends Animal {
    void printname() {
        System.out.println("My name is Felix.");
    }
}
