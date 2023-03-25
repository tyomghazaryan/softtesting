public class Employee {
    private String position;
    private int salary;
    private int age;
    private int numberOfDaysWorked;

    public Employee(String position, int salary, int age, int numberOfDaysWorked) {
        this.position = position;
        this.salary = salary;
        this.age = age;
        this.numberOfDaysWorked = numberOfDaysWorked;
    }

    public String getPosition() {
        if (position == null) {
            return "No position assigned";
        }
        return position;
    }


    public int getSalary() {
        if (salary < 0)
            return 0;

        return salary;
    }

    public int numberOfDaysWorked() {
        if (numberOfDaysWorked < 0)
            return 0;

        return numberOfDaysWorked;
    }

    public boolean isEligibleForPromotion() {
        if (numberOfDaysWorked < 365)
            return false;

        return true;
    }
}


