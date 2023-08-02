import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван Иванов", 1, 30);
        employees[1] = new Employee("Иван1 Иванов", 2, 600);
        employees[2] = new Employee("Иван2 Иванов", 1, 750);
        employees[3] = new Employee("Иван3 Иванов", 3, 550);
        employees[4] = new Employee("Иван4 Иванов", 2, 700);
        employees[5] = new Employee("Иван5 Иванов", 4, 400);
        employees[6] = new Employee("Иван6 Иванов", 3, 550);
        employees[7] = new Employee("Иван7 Иванов", 5, 450);
        employees[8] = new Employee("Иван8 Иванов", 1, 500);
        employees[9] = new Employee("Иван9 Иванов", 4, 600);

        System.out.println("Общая Зарплата: " + calculateTotalSalary(employees));
        System.out.println("Минимальня Заплата: " + findEmployeeWithMinSalary(employees).toString());
        System.out.println("Максимальная Заплата: " + findEmployeeWithMaxSalary(employees).toString());
        System.out.println("Средняя Заплата: " + calculateAverageSalary(employees));
        indexSalary(employees, 10);
        System.out.println("Сотрудник Отдела 1:");
        System.out.println("Сотрудник с Заплатой  < 500:");
        printEmployeesWithSalaryLessThan(employees, 500);
        System.out.println("Сотрудник с Заплатой >= 600");
        printEmployeesWithSalaryGreaterThanEqualTo(employees, 600);
    }

    public static int calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static int calculateAverageSalary(Employee[] employees) {
        int totalSalary = calculateTotalSalary(employees);
        return (int) (totalSalary / employees.length);
    }

    public static void indexSalary(Employee[] employees, int percentage) {
        for (Employee employee : employees) {
            int increasedSalary = (int) (employee.getSalary() * (1 + percentage / 100));
            employee.setSalary(increasedSalary);
        }
    }

    public static void printEmployeesByDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + ", Имя Фамилия: " + employee.getFulName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryLessThan(Employee[] employees, int threshold) {
        for (Employee employee : employees) {
            if (employee.getSalary() < threshold) {
                System.out.println("ID: " + employee.getId() + ", Имя Фамилия: " + employee.getFulName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryGreaterThanEqualTo(Employee[] employees, int threshold) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= threshold) {
                System.out.println("ID: " + employee.getId() + ", Имя Фамилия: " + employee.getFulName() + ", Заплата: " + employee.getSalary());
            }
        }
    }
}