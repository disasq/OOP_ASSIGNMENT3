public class Programmer {
    private int salary = 1000;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
            System.out.println("Salary updated to: " + this.salary);
        } else {
            System.out.println("New salary must be greater than the current salary.");
        }
    }
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println("Current Salary: " + programmer.getSalary());
        programmer.setSalary(1200);
        programmer.setSalary(900);
    }
}