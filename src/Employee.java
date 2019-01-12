public class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Jestem pracownikiem o imieniu "+ this.name+", mam "+this.age+" lat" + ", zarabiam "+this.salary+" zł";
    }

    @Override
    public boolean equals(Object object){

        if(this == object){
            System.out.println("Równość referencyjna");
            return true;
        }

        if (object == null){
            return false;
        }

        if(this.getClass()!= object.getClass()){
            return false;
        }

        Employee employee = (Employee)object;

        if (this.name==null){
            if (employee.name != null){
                return false;
            }
        } else

        if(!this.name.equals(employee.name)) {
        return false;
        }

        if (this.age!=employee.age) {
            return false;
        }

        if (this.salary!=employee.salary){
            return false;
        }
        return true;

       /* return this.name.equals(((Employee)object).name);*/
    }


}
