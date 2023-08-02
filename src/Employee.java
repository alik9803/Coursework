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
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя Фамилия: " + fulName + ", Отдел: " + department + ", Зарплата: " + salary;
    }
}