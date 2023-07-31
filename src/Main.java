public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван Иванов", 1, 500);
        employees[1] = new Employee("Иван1 Иванов", 2, 600);
        employees[2] = new Employee("Иван2 Иванов", 1, 450);
        employees[3] = new Employee("Иван3 Иванов", 3, 550);
        employees[4] = new Employee("Иван4 Иванов", 2, 700);
        employees[5] = new Employee("Иван5 Иванов", 4, 400);
        employees[6] = new Employee("Иван6 Иванов", 3, 550);
        employees[7] = new Employee("Иван7 Иванов", 5, 450);
        employees[8] = new Employee("Иван8 Иванов", 1, 500);
        employees[9] = new Employee("Иван9 Иванов", 4, 600);

        System.out.println("Общая Зарплата: " + Employee.calculateTotalSalary(employees));
        System.out.println("Минимальня Заплата: " + Employee.findEmployeeWithMinSalary(employees).toString());
        System.out.println("Максимальная Заплата: " + Employee.findEmployeeWithMaxSalary(employees).toString());
        System.out.println("Средняя Заплата: " + Employee.calculateAverageSalary(employees));
        Employee.indexSalary(employees, 10);
        System.out.println("Сотрудник Отдела 1:");
        Employee.printEmployeesByDepartment(employees, 1);
        System.out.println("Сотрудник с Заплатой  < 500:");
        Employee.printEmployeesWithSalaryLessThan(employees, 500);
        System.out.println("Сотрудник с Заплатой >= 600");
        Employee.printEmployeesWithSalaryGreaterThanEqualTo(employees, 600);
    }
}