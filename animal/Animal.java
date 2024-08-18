class Animal implements Vocability {
    private String name;
    private int age;
    private int weight;

    public Animal() {
        name = "NAME";
        age = 0;
        weight = 1;
    }

    public Animal(String name) {
        this.name = name;
        age = 0;
        weight = 1;
    }

    public void growUp() {
        age += 1;
        weight += 2;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("[Silence...]");
    }

    public void printInfo() {
        System.out.println("<Animal.printInfo>");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);
    }
}
