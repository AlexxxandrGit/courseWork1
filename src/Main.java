import java.util.Arrays;
import java.util.List;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        getAdetailedListOfEmployees();
        calculateTheAmountOfSalaryCostsPerMonth();
        findAnEmployeeWithTheMinimumWage();
        findTheEmployeeWithTheHighestSalary();
        calculateTheAverageSalary();
        getTheFullNameOfAllEmployees();


    }

    //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
    public static void getAdetailedListOfEmployees() {
        employees[0] = new Employee("Aleksandr Vladimirovich Lobanov", 1, 300_000);
        employees[1] = new Employee("Ivan Dmitrievich Petrov", 2, 2000_000);
        employees[2] = new Employee("Aleksandr Dmitrievich Suslov", 2, 70_000);
        employees[3] = new Employee("Igor Vasilevich Shnurov", 2, 90_000);
        employees[4] = new Employee("Aleksandra Sergeevna Matveeva", 2, 70_000);
        employees[5] = new Employee("Liliya Razilevna Lobanova", 2, 100_000);
        employees[6] = new Employee("Marina Arkadevna Zueva", 2, 40_000);
        employees[7] = new Employee("Oleg Anatolevich Garazin", 2, 55_000);
        employees[8] = new Employee("yuliya Vadimovna Bognenko", 2, 88_000);
        employees[9] = new Employee("Vladimir Petrovich Popedin", 2, 78_000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    // Посчитать сумму затрат на зарплаты в месяц.
    public static int calculateTheAmountOfSalaryCostsPerMonth() {
        employees[0] = new Employee("Aleksandr Vladimirovich Lobanov", 1, 300_000);
        employees[1] = new Employee("Ivan Dmitrievich Petrov", 2, 2000_000);
        employees[2] = new Employee("Aleksandr Dmitrievich Suslov", 2, 70_000);
        employees[3] = new Employee("Igor Vasilevich Shnurov", 2, 90_000);
        employees[4] = new Employee("Aleksandra Sergeevna Matveeva", 2, 70_000);
        employees[5] = new Employee("Liliya Razilevna Lobanova", 2, 100_000);
        employees[6] = new Employee("Marina Arkadevna Zueva", 2, 40_000);
        employees[7] = new Employee("Oleg Anatolevich Garazin", 2, 55_000);
        employees[8] = new Employee("yuliya Vadimovna Bognenko", 2, 88_000);
        employees[9] = new Employee("Vladimir Petrovich Popedin", 2, 78_000);

        int summa = 0;

        for (Employee employee : employees) {
            summa += employee.getEmployeeSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + summa);
        return summa;
    }


    //Найти сотрудника с минимальной зарплатой.

    public static void findAnEmployeeWithTheMinimumWage() {
        employees[0] = new Employee("Aleksandr Vladimirovich Lobanov", 1, 300_000);
        employees[1] = new Employee("Ivan Dmitrievich Petrov", 2, 2000_000);
        employees[2] = new Employee("Aleksandr Dmitrievich Suslov", 2, 70_000);
        employees[3] = new Employee("Igor Vasilevich Shnurov", 2, 90_000);
        employees[4] = new Employee("Aleksandra Sergeevna Matveeva", 2, 70_000);
        employees[5] = new Employee("Liliya Razilevna Lobanova", 2, 100_000);
        employees[6] = new Employee("Marina Arkadevna Zueva", 2, 40_000);
        employees[7] = new Employee("Oleg Anatolevich Garazin", 2, 55_000);
        employees[8] = new Employee("yuliya Vadimovna Bognenko", 2, 88_000);
        employees[9] = new Employee("Vladimir Petrovich Popedin", 2, 78_000);

        Employee result = employees[0];
        if (employees[0] != null) {
            double minSalary = employees[0].getEmployeeSalary();
            for (Employee employee : employees) {
                if (employee.getEmployeeSalary() < minSalary) {
                    minSalary = employee.getEmployeeSalary();
                    result = employee;


                }
            }

        }

        System.out.println(result);

    }

    //Найти сотрудника с максимальной зарплатой.
    public static void findTheEmployeeWithTheHighestSalary() {
        employees[0] = new Employee("Aleksandr Vladimirovich Lobanov", 1, 300_000);
        employees[1] = new Employee("Ivan Dmitrievich Petrov", 2, 2000_000);
        employees[2] = new Employee("Aleksandr Dmitrievich Suslov", 2, 70_000);
        employees[3] = new Employee("Igor Vasilevich Shnurov", 2, 90_000);
        employees[4] = new Employee("Aleksandra Sergeevna Matveeva", 2, 70_000);
        employees[5] = new Employee("Liliya Razilevna Lobanova", 2, 100_000);
        employees[6] = new Employee("Marina Arkadevna Zueva", 2, 40_000);
        employees[7] = new Employee("Oleg Anatolevich Garazin", 2, 55_000);
        employees[8] = new Employee("yuliya Vadimovna Bognenko", 2, 88_000);
        employees[9] = new Employee("Vladimir Petrovich Popedin", 2, 78_000);

        Employee result = employees[0];
        double maxSalary = employees[0].getEmployeeSalary();
        for (Employee employee : employees) {
            if (employee.getEmployeeSalary() > maxSalary) {
                maxSalary = employee.getEmployeeSalary();
                result = employee;
                System.out.println(employee);
            }

        }
    }


    //Подсчитать среднее значение зарплат.
    public static void calculateTheAverageSalary() {
        employees[0] = new Employee("Aleksandr Vladimirovich Lobanov", 1, 300_000);
        employees[1] = new Employee("Ivan Dmitrievich Petrov", 2, 2000_000);
        employees[2] = new Employee("Aleksandr Dmitrievich Suslov", 2, 70_000);
        employees[3] = new Employee("Igor Vasilevich Shnurov", 2, 90_000);
        employees[4] = new Employee("Aleksandra Sergeevna Matveeva", 2, 70_000);
        employees[5] = new Employee("Liliya Razilevna Lobanova", 2, 100_000);
        employees[6] = new Employee("Marina Arkadevna Zueva", 2, 40_000);
        employees[7] = new Employee("Oleg Anatolevich Garazin", 2, 55_000);
        employees[8] = new Employee("yuliya Vadimovna Bognenko", 2, 88_000);
        employees[9] = new Employee("Vladimir Petrovich Popedin", 2, 78_000);


        double summa = 0;

        for (Employee employee : employees) {
            summa += employee.getEmployeeSalary();

        }
        double averageSalary = summa / 10;

        System.out.println("Среднее значение зарплат " + averageSalary + " руб");
    }

    //Получить Ф. И. О. всех сотрудников (вывести в консоль).

    public static void getTheFullNameOfAllEmployees() {
        employees[0] = new Employee("Aleksandr Vladimirovich Lobanov", 1, 300_000);
        employees[1] = new Employee("Ivan Dmitrievich Petrov", 2, 2000_000);
        employees[2] = new Employee("Aleksandr Dmitrievich Suslov", 2, 70_000);
        employees[3] = new Employee("Igor Vasilevich Shnurov", 2, 90_000);
        employees[4] = new Employee("Aleksandra Sergeevna Matveeva", 2, 70_000);
        employees[5] = new Employee("Liliya Razilevna Lobanova", 2, 100_000);
        employees[6] = new Employee("Marina Arkadevna Zueva", 2, 40_000);
        employees[7] = new Employee("Oleg Anatolevich Garazin", 2, 55_000);
        employees[8] = new Employee("yuliya Vadimovna Bognenko", 2, 88_000);
        employees[9] = new Employee("Vladimir Petrovich Popedin", 2, 78_000);


        for (Employee employee : employees) {
            System.out.println(employee.getFullNameOfTheEmployee());

        }


    }


}