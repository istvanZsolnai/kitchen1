public class Cook extends Employee implements Cookable {
    public Cook(int salary, String birthDate, String name) {
        super(salary, birthDate, name);
    }

    @Override
    public void toCook() {
        System.out.println("Im cooking mofo");
    }

}

