import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getPosition() {
        Employee employee = new Employee(null, 0, 0, 0);
        assertEquals("No position assigned", employee.getPosition());

        employee = new Employee("Manager", 0, 0, 0);
        assertEquals("Manager", employee.getPosition());
    }

    @Test
    void getSalary() {
        Employee employee = new Employee(null, -1000, 0, 0);
        assertEquals(0, employee.getSalary());

        employee = new Employee(null, 0, 0, 0);
        assertEquals(0, employee.getSalary());

        employee = new Employee(null, 1000, 0, 0);
        assertEquals(1000, employee.getSalary());
    }

    @Test
    void numberOfDaysWorked() {
        Employee employee = new Employee(null, 0, 0, -100);
        assertEquals(0, employee.numberOfDaysWorked());

        employee = new Employee(null, 0, 0, 0);
        assertEquals(0, employee.numberOfDaysWorked());

        employee = new Employee(null, 0, 0, 100);
        assertEquals(100, employee.numberOfDaysWorked());
    }

    @Test
    void isEligibleForPromotion() {
        Employee employee = new Employee(null, 0, 0, 0);
        assertEquals(false, employee.isEligibleForPromotion());

        employee = new Employee(null, 0, 0, 364);
        assertEquals(false, employee.isEligibleForPromotion());

        employee = new Employee(null, 0, 0, 365);
        assertEquals(true, employee.isEligibleForPromotion());
    }
}