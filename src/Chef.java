import java.util.List;
import java.util.Random;

public class Chef extends Employee implements Cookable {
    protected List<KitchenHelper> listOfKitchenHelpers;

    public Chef(int salary, String birthDate, String name) {
        super(salary, birthDate, name);
    }

    @Override
    public void toCook() {
        Random random = new Random();
        int carrotNeeded = 1;
        int potatoNeeded = 2;
        int meatNeeded = 3;
        for (int i = 0; i < 10; i++) {
            int randomCounter = random.nextInt(5);

            if (randomCounter == carrotNeeded) {
                askForIngredient(IngridientProvider.CARROT);
            } else if (randomCounter == potatoNeeded) {
                askForIngredient(IngridientProvider.POTATO);
            } else if (randomCounter == meatNeeded) {
                askForIngredient(IngridientProvider.MEAT);
            }

        }

    }

    public void askForIngredient(IngridientProvider wanteding) {
        IngridientProvider wantedIng = IngridientProvider.getRandom();
        System.out.println("i'm out of " + wantedIng);
    }


}
