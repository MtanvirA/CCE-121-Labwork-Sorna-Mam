class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Mew Mew!");
    }
}

public class ClassOverride {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        Cat myCat = new Cat();         

        System.out.print("Animal says: ");
        myAnimal.makeSound();

        System.out.print("Cat says: ");
        myCat.makeSound();
    }
}
