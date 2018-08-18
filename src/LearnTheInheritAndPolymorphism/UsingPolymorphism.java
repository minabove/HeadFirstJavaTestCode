package LearnTheInheritAndPolymorphism;

public class UsingPolymorphism
{
    public static void main(String[] args) {
        AnimalTestDrive test = new AnimalTestDrive();
        test.TestAnimalArrayList();
        ShibaInu s = new ShibaInu();
        test.TestObject(s);
        Object o = new AnimalTestDrive();
        ((AnimalTestDrive) o).TestAnimalArrayList();
    }
}

class AnimalTestDrive
{
    public void TestAnimalArrayList(){
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog("JoJo",15,25);
        Cat c = new Cat("MiMi",12,10);
        list.add(a);
        list.add(c);
        System.out.println(c.toString());
        System.out.println(c.equals(a));
        System.out.println(c.getClass());
    }
    public void TestObject(Object object){
        System.out.println("This is testing Object");
    }
}

class MyAnimalList
{
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a){
        if(nextIndex < animals.length){
            animals[nextIndex] = a;
            System.out.println("Animal added at "+ nextIndex);
            nextIndex++;
        }
    }
}