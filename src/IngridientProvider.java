import java.util.Random;

public enum IngridientProvider {
    CARROT,
    POTATO,
    MEAT;

    private static final Random random = new Random();

    static public IngridientProvider getRandom() {
        int randomNumber = random.nextInt(3);
        IngridientProvider wantedIng = null;

        switch (randomNumber) {
            case 0:
                wantedIng = IngridientProvider.CARROT;
                break;
            case 1:
                wantedIng = IngridientProvider.MEAT;
                break;
            case 2:
                wantedIng = IngridientProvider.POTATO;
                break;
        }
        System.out.println("I recieved " + wantedIng);

        return wantedIng;
    }
}
