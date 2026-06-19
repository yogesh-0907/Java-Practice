class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog eats bones");
    }
}

class Puppy extends Dog {

    @Override
    void eat() {
        System.out.println("Puppy drinks milk");
    }

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
    }
}