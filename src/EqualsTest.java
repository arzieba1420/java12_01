public class EqualsTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jan",32,3000);
        Employee emp2 = new Employee("Jan",32,3000);

        if (emp1.equals(emp2)){
            System.out.println("Ten sam pracownik");
        }
    }
}
