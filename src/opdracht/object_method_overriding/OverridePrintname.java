package opdracht.object_method_overriding;

public class OverridePrintname {
    public static void main(String[] args) {
        // roep method printname in class Animal aan

        // roep method printname in class Dog aan

        // roep method printname in class Cat aan

    }
}

class Animal {
    void printname() {
        System.out.println("I have no name yet.");
    }
}
class Dog extends Animal {
    void printname() {
        System.out.println("I'm a dog.");
    }
}

class Cat extends Animal {
    void printname() {
        System.out.println("I'm a cat.");
    }
}
