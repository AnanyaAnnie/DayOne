import java.util.Random;

public class random {
    public static void main(String [] args)
    {
        Random num = new Random();

        int ran = num.nextInt();

        System.out.println(ran);
    }
}
