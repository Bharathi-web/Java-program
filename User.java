package JavaTask;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("barks");
    }
}

public class User  {
    public static void main(String[] args) {
        Cat c = new Cat();
        
        c.makeSound();
    }
}