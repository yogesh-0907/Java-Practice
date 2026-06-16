class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {

        Cat c = new Cat();

        c.eat();
        c.meow();
    }
}