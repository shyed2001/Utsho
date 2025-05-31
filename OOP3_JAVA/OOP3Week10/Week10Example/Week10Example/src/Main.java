// Polymorphism

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Cat extends Animal {
	  public void animalSound() {
	    System.out.println("The cat says: meow meow");
	  }
	}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    Animal myCat = new Cat();  // Create a Cat object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
    myCat.animalSound();
  }
}
