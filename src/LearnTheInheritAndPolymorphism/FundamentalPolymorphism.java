package LearnTheInheritAndPolymorphism;

public class FundamentalPolymorphism {

    public static void main(String[] args) {
        Animal dog = new Dog("JoJo",25.5,12.5);
        dog.Sound();
        dog.method();

        Vet v = new Vet();
        Animal cat = new Cat("MiMi",20.5,8.5);
        v.playSound(cat);


        // Animal animal = new Animal();   error  !!

        Animal dog2 = new Dog("PaPi",20,10);


    }

}

class Vet
{
    public void playSound(Animal animal){
        animal.Sound();
    }
}


abstract class Animal
{
    protected String name;
    protected double height;
    protected double weihgt;
    public Animal() {  }
    public void Sound(){  }
    final void method(){
        System.out.println("Test the keyword final!");
    }
    public abstract void TestAbstractMethod();
}

class Dog extends Animal
{
    public Dog(String aName,double aHeight,double aWeight){
        name = aName;
        height = aHeight;
        weihgt = aWeight;
    }
    public void Sound(){
        System.out.println("I am a dog.");
        System.out.println("My name is "+name+".");
    }
    public void TestAbstractMethod(){

    }
//    final void method(){
//        System.out.println("Test the keyword final!");
//    }
}

class Cat extends Animal
{
    public Cat(String aName,double aHeight,double aWeight){
        name = aName;
        height = aHeight;
        weihgt = aWeight;
    }
    public void Sound(){
        System.out.println("I am a cat.");
        System.out.println("My name is "+name+".");
    }
    public void TestAbstractMethod(){

    }
}

class Pig extends Animal
{
    public Pig(String aName,double aHeight,double aWeight){
        name = aName;
        height = aHeight;
        weihgt = aWeight;
    }
    public void Sound(){
        System.out.println("I am a pig.");
        System.out.println("My name is "+name+".");
    }
    public void TestAbstractMethod(){

    }
}
