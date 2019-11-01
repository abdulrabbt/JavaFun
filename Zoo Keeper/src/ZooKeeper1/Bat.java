package ZooKeeper1;

public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        energyLevel -= 50;
        System.out.println("Woosh");
        displayEnergy();
    }
    public void eatHumans() {
        energyLevel += 25;
        System.out.println("Human and feel more energetic");
        displayEnergy();
    }
    public void attackTown() {
        energyLevel -= 100;
        System.out.println("Rawr");
        displayEnergy();
    }
}
