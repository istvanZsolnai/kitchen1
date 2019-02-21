abstract class Employee {
    protected int salary;
    protected String birthDate;
    protected String name;

    public Employee(int salary, String birthDate, String name) {
        this.salary = salary;
        this.birthDate = birthDate;
        this.name = name;
    }

    public int calculateTax() {
        return (int) (salary * 0.99);
    }
}
