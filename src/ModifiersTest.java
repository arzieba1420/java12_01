public class ModifiersTest {
    static synchronized protected final void  specialMethod(){
    }
    public static final int A = 5;

    public static void main(String[] args) {

       /* A a = new A();

        a.setCounter(124);
        a.print();*/

       WashingMachine washingMachine = new WashingMachine();
       /*washingMachine.temperature=200;*/
        washingMachine.modeForSensitiveClothes();

    }
}

class A{
    protected int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter*2;
    }

    public void print(){
        System.out.println("Jestem obiektem klasy A, licznik "+counter);
    }
}

class B {
    A a = new A();
    void test(){
       int i = a.counter;
    }
}
