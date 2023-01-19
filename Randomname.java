import java.util.Random;

public class Randomname {
    public static void main(String[] args){
    Random ran = new Random();
    int in = ran.nextInt(10);
    String nameStudent[] = { "Annie", "Akash", "Payu", "Chinky", "Asis", "Gudu", "Rasmita", "Jessy", "Mamali", "Nitu" };
    System.out.println(nameStudent[in]);
    }
    
}
