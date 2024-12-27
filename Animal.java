package JavaTask;

class user {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("barks");
    }
}

class Animal  {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        
        myCat.makeSound();
    }
}