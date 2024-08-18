class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("<Cat.makeSound>");
        System.out.println("Meow~ ");
    }
}
