package ex40;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void searchShouldReturnFiltertedListWhenSearchingByJac() {
        Employee emp = new Employee("John","Johnson","Manager", "2016-12-31");
        emp.employees.put(1,emp);
        Employee emp1 = new Employee("Tou","Xiong","Software Engineer", "2016-10-05");
        emp.employees.put(2,emp1);
        Employee emp2 = new Employee("Michaela","Michaelson","District Manager", "2015-12-19");
        emp.employees.put(3,emp2);
        Employee emp3 = new Employee("Jacquelyn","Jackson","DBA", "");
        emp.employees.put(4,emp3);
        Employee emp4 = new Employee("Jake","Jacobson","Programmer", "");
        emp.employees.put(5,emp4);
        Employee emp5 = new Employee("Sally","Webber","Web Developer", "2015-12-18");
        emp.employees.put(6, emp5);

        Map<Integer, Employee> sortedList = ex40.Employee.search("Jac");
        assertEquals("[4, 5]", sortedList.keySet().toString());
    }

    @Test
    void searchShouldReturnFiltertedListWhenSearchingByMich() {
        Employee emp = new Employee("John","Johnson","Manager", "2016-12-31");
        emp.employees.put(1,emp);
        Employee emp1 = new Employee("Tou","Xiong","Software Engineer", "2016-10-05");
        emp.employees.put(2,emp1);
        Employee emp2 = new Employee("Michaela","Michaelson","District Manager", "2015-12-19");
        emp.employees.put(3,emp2);
        Employee emp3 = new Employee("Jacquelyn","Jackson","DBA", "");
        emp.employees.put(4,emp3);
        Employee emp4 = new Employee("Jake","Jacobson","Programmer", "");
        emp.employees.put(5,emp4);
        Employee emp5 = new Employee("Sally","Webber","Web Developer", "2015-12-18");
        emp.employees.put(6, emp5);

        Map<Integer, Employee> sortedList = ex40.Employee.search("Mich");
        assertEquals("[3]", sortedList.keySet().toString());
    }

    @Test
    void searchShouldReturnFiltertedListWhenSearchingByJo() {
        Employee emp = new Employee("John","Johnson","Manager", "2016-12-31");
        emp.employees.put(1,emp);
        Employee emp1 = new Employee("Tou","Xiong","Software Engineer", "2016-10-05");
        emp.employees.put(2,emp1);
        Employee emp2 = new Employee("Michaela","Michaelson","District Manager", "2015-12-19");
        emp.employees.put(3,emp2);
        Employee emp3 = new Employee("Jacquelyn","Jackson","DBA", "");
        emp.employees.put(4,emp3);
        Employee emp4 = new Employee("Jake","Jacobson","Programmer", "");
        emp.employees.put(5,emp4);
        Employee emp5 = new Employee("Sally","Josh","Web Developer", "2015-12-18");
        emp.employees.put(6, emp5);

        Map<Integer, Employee> sortedList = ex40.Employee.search("Jo");
        assertEquals("[1, 6]", sortedList.keySet().toString());
    }
}