class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("<Dog.makeSound>");
        System.out.println("Woof! ");
    }
}
