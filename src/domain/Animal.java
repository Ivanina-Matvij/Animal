<<<<<<< HEAD
package domain;

public class Animal {

    protected String name;
    protected int weight;

    public Animal() {
        name="generic animal";
        weight=25;
    }
    public void eat() {
        System.out.println("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg";
    }
 
}
=======
package domain;

public class Animal {

    protected String name;
    protected int weight;

    public Animal() {
        name="generic animal";
        weight=25;
    }
    public void eat() {
        System.out.println("Animal eating...");
    }

    public void speak() {
        System.out.println("Animal speaking...");
    }

    @Override
    public String toString() {
        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg";
    }
 
}
>>>>>>> 3a2be4c7cfa3cb7a0da2f4770360628348d714f4
