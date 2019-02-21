import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<KitchenHelper> listOfKitchenHelpers = new ArrayList<>();
    private List<Cook> listOfCooks = new ArrayList<>();
    private List<Chef> listOfChefs = new ArrayList<>();

    public void addKitchenHelper(KitchenHelper kitchenHelper) {
        listOfKitchenHelpers.add(kitchenHelper);
    }

    public void addCook(Cook cook) {
        listOfCooks.add(cook);
    }

    public void addChef(Chef chef) {
        listOfChefs.add(chef);
    }

    @Override
    public String toString() {
        return "    Kitchen{" +
                "listOfKitchenHelpers=" + listOfKitchenHelpers +
                ", listOfCooks=" + listOfCooks +
                ", listOfChefs=" + listOfChefs +
                '}';
    }
}
