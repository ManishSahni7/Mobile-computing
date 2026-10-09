interface Pet {
    void play();
}

interface Guard {
    void protect();
}

class Dog implements Pet, Guard {
    String name;

    public void play() {
        System.out.println(name + " is playing with a ball");
    }

    public void protect() {
        System.out.println(name + " is guarding the house");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Rocky";

        myDog.play();
        myDog.protect();
    }
}