package LearnTheInheritAndPolymorphism;

public class UsingInterface
{
    public static void main(String[] args) {

    }
}

interface Pet
{
    void beFriendly();
    void play();
}

interface LittleAnimal
{
    void beFeed();
    void beProtected();
}

abstract class one
{
    abstract void show();
}

class DoG extends one implements Pet,LittleAnimal
{
    public void beFriendly(){

    }
    public void play(){

    }
    public void beFeed(){

    }
    public void beProtected(){

    }
    void show(){

    }
}