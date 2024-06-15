public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("Gorilla throws something");
        energy -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla eats bananas");
        energy += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbs a tree");
        energy -= 10;
    }
}