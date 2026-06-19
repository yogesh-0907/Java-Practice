class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class RuntimePolymorphism {

    public static void main(String[] args) {

        Animal a = new Cat();

        a.sound();
    }
}