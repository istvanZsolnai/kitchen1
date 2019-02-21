import java.util.Random;

public class KitchenHelper extends Employee {
    protected int amountOfCarrots;
    private int amountOfPotatos;
    private int amountOfMeat;

    Random random = new Random();

    public KitchenHelper(int salary, String birthDate, String name) {
        super(salary, birthDate, name);
        this.amountOfCarrots = random.nextInt(3);
        this.amountOfMeat = random.nextInt(3);
        this.amountOfPotatos = random.nextInt(3);
    }


}
