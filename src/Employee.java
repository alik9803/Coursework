public class Employee {
    private static int counter = 0;
    private int id;
    private String fulName;
    private int department;
    private int salary;

    public Employee(String fulName, int department, int salary) {
        this.id = counter++;
        this.fulName = fulName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFulName() {
        return fulName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = (int) salary;
    }

    public static void printAllEmployee(Employee[] employees) {
        for (Employee employee : employees) ;
        System.out.println(employees.toString());
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

    @Override
    public String toString() {
        return "ID: " + id + ", Имя Фамилия: " + fulName + ", Отдел: " + department + ", Зарплата: " + salary;
    }
}

