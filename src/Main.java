interface Animal {
    void eat(String food);

    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Гав");
    }
    @Override
    public void eat(String food) {
        System.out.println("Ест " + food);
    }
}

class Cat implements Animal {
    @Override
    public void eat(String food) {
        System.out.println("Ест " + food);
    }
    @Override
    public void sound() {
        System.out.println("Мяу");
    }
}

interface Pet extends Animal {
    void play();
}

class DogPet implements Pet {
    @Override
    public void eat(String food) {
        System.out.println("Ест кость");
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }

    @Override
    public void play() {
        System.out.println("Играет в мячик");
    }
}
class CatPet implements Pet {
    @Override
    public void eat(String food) {
        System.out.println("Ест " + food);
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }

    @Override
    public void play() {
        System.out.println("Играет с мышкой");
    }
}

public class Main {
    public static void main(String[] args) {
        DogPet dog = new DogPet();
        CatPet cat = new CatPet();


        dog.eat("корм");
        dog.sound();
        dog.play();
        System.out.println("");

        cat.eat("рыбёху");
        cat.sound();
        cat.play();
    }
}