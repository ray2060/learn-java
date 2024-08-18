public class TestAnimal {
    public static void main(String args[]) {
        Animal cat1 = new Cat("Alice");
        Animal dog1 = new Dog("Bob");
        Animal dog2 = new Dog();
        cat1.printInfo();
        dog1.printInfo();
        dog2.printInfo();
        cat1.growUp();
        cat1.growUp();
        cat1.growUp();
        cat1.printInfo();
        dog1.growUp();
        dog1.printInfo();
        dog2.growUp();
        dog2.growUp();
        dog2.printInfo();
        cat1.makeSound();
        dog1.makeSound();
        dog2.makeSound();
    }
}
