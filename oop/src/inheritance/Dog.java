package inheritance;

public class Dog extends Animal {

  public static void main (String [] args) {
    Dog dog = new Dog();
    
    dog.setNumberOfHands(2);
    System.out.println(dog.getNumberOfHands());
  }
  
}
