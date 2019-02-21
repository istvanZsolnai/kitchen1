public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Chef chef1 = new Chef(50, "1994.12.12", "Béla");
        kitchen.addChef(chef1);

        KitchenHelper kitchenHelper1 = new KitchenHelper(20, "2000.12.10", "Jónás");
        KitchenHelper kitchenHelper2 = new KitchenHelper(15, "2001.12.10", "Huba");
        kitchen.addKitchenHelper(kitchenHelper1);
        kitchen.addKitchenHelper(kitchenHelper2);

        Cook cook1 = new Cook(35, "1990.01.23", "Zolika");
        Cook cook2 = new Cook(35, "1984.06.17", "Jocó");


        kitchen.addCook(cook1);
        kitchen.addCook(cook2);

        System.out.println(kitchen.toString());
        System.out.println("Employee's Taxes: ");
        System.out.println("Chef: " + chef1.calculateTax());
        System.out.println("Kitchen helpers: " + kitchenHelper1.calculateTax() + ", " + kitchenHelper2.calculateTax());
        System.out.println("Cooks: " + cook1.calculateTax() + ", " + cook2.calculateTax());

        chef1.toCook();


    }
}
