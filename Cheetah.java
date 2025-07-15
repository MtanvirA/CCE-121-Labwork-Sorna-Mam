class Animal {
    void move() {
        System.out.println("Animal is moving");
    }
}

class Cheetahs extends Animal {
    void move() {
        System.out.println("Running");
    }
}

public class Cheetah {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.move();

        Cheetahs speedyCat = new Cheetahs();
        speedyCat.move();
    }
}
