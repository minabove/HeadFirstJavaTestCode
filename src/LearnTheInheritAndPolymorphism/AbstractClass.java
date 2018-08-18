package LearnTheInheritAndPolymorphism;

import java.util.ArrayList;

public class AbstractClass
{
    public static void main(String[] args) {
        ArrayList<ShibaInu> shibaInusList = new ArrayList<ShibaInu>();
        ShibaInu hoho = new ShibaInu();
        shibaInusList.add(hoho);

        ShibaInu[] ChaiQuans = new ShibaInu[5];
        ShibaInu[] HaHa = ChaiQuans.clone();

    }
}

abstract class SomeDog extends Animal
{
    public SomeDog() {  }
    public abstract void MakeNoise();

}

class ShibaInu extends SomeDog
{
    public void MakeNoise() {
        System.out.println("Mua");
    }
    public void TestAbstractMethod(){
        System.out.println();
    }
}