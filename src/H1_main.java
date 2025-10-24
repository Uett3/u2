import java.util.Random;

public class H1_main {

    Random rand = new Random();
    //int z = rand.nextInt(99);

    public static void main(String[] args) {
        int z = 9;
        System.out.println(z);
        if ( z > 10){
            z = z -10;
        }
        System.out.println(z);
    }
}