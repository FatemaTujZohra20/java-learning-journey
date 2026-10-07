package day08_type_conversion_and_type_casting.reference_type_casting.upcasting;

/**
 * Parent class.
 */
class Animal{
    
    public void eat(){
        System.out.println("Animal is eating.");
    }
    
    public void makeSound(){
        System.out.println("Animal makes sound.");
    }
}

/**
 * Child class.
 */
class Dog extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("Dog barks!");
    }
}


/**
 * Demonstrates reference type upcasting.
 * <p>
 * Upcasting happens when a child-class object is assigned
 * to a parent-class reference.
 * <p>
 * Relationship:
 * <p>
 * Dog IS-A Animal
 * <p>
 * Therefore:
 * <p>
 * Dog object -> Animal reference
 * <p>
 * This conversion is safe and happens automatically.
 */

public class DogAnimalUpcasting {
    public static void main(String[] args){
        
        // Create a Dog object.
        Dog dog = new Dog();
        
        /*
         * Upcasting:
         *
         * A Dog object is assigned to an Animal reference.
         *
         * Java allows this automatically because Dog
         * inherits from Animal.
         */
        Animal animal = dog;
        
        /*
         * The reference type is Animal.
         *
         * Therefore, we can directly access members
         * available through the Animal reference.
         */
        animal.eat();
        
        /*
         * The actual object is still a Dog.
         *
         * Java uses dynamic method dispatch for overridden
         * instance methods.
         *
         * Therefore, Dog's version of makeSound() is executed.
         */
        animal.makeSound();
    }
}
