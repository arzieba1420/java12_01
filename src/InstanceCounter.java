public class InstanceCounter {

    private static int numInstances = 0;

    public static int getCount() {
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Rozpoczynanie z "+ InstanceCounter.getCount()+ " obiektów");

        for (int i = 0; i <500 ; i++) {
            new InstanceCounter();
        }

        System.out.println("utworzonmo "+InstanceCounter.getCount()+" obiektów");
    }
}

class AAA extends InstanceCounter{
    public static int getCount() {     //przesłonięcie mozliwe bo nie ma final
        return 123;
    }
}
