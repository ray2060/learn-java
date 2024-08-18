class Dog {
	private int weight;
	private int age;
	private String name;
	
	public Dog(String name) {
		this.name = name;
		age = 0;
		weight = 1;
	} 
	
	public void growUp() {
		age += 1;
		weight += 2;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}

public class TestDog {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bob");
        
        System.out.println("The dog's name is " + myDog.getName() + ". ");
        
        System.out.println("The dog is " + myDog.getAge() + " years old. ");
        
        myDog.growUp();
        System.out.println("The dog grew up. ");
        
        System.out.println("The dog weighs " + myDog.getWeight() + " kilograms. ");
        
        System.out.println("The dog is " + myDog.getAge() + " years old. ");
    }
}