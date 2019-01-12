import java.awt.*;

public class toString {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString());

        Point point = new Point(2,5);
        System.out.println(point.toString());
        System.out.println("--------------------------------");

        Employee employee = new Employee("Tomek",28);
        System.out.println(employee.toString());
        Employee [] employees = {new Employee("Michał",23),
                                 new Employee("Marcin",25),
                                 new Employee("Arkadiusz",30)
                                };

        for (int j = 0; j <employees.length ; j++) {
            System.out.println(employees[j]);
        }

        Employee employee2 = new Employee("Zofia",30,3000.00);
        System.out.println(employee2);

        System.out.println("------------------"); //klasa Product
        Product product = new Product("mleko",2.86);
        System.out.println(product);
    }
}
