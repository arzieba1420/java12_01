import java.util.Objects;
import java.util.Random;

public class Lab4_2 {
    public static void main(String[] args) {
        Random random = new Random();

        ResultClass round1;

        ResultClass result = new ResultClass(7,7,7);

        /*do{
                 ResultClass round1 = new ResultClass(random);

        } while (!round1.equals(result));
*/

    }
}


class ResultClass{
    int x1,x2,x3;

   public ResultClass(int x1, int x2, int x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public ResultClass(Random random) {
        this.x1 = random.nextInt(10)+1;
        this.x2 = random.nextInt(10)+1;
        this.x3 = random.nextInt(10)+1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultClass that = (ResultClass) o;
        return x1 == that.x1 &&
                x2 == that.x2 &&
                x3 == that.x3;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x1, x2, x3);
    }
}
