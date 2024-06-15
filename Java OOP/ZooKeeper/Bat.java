public class Bat extends Mammal {
    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        System.out.println("Bat is airborne");
        energy -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat eats humans");
        energy += 25;
    }

    public void attackTown() {
        System.out.println("Bat attacks a town");
        energy -= 100;
    }
}