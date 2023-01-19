public class loops {
    public static void main(String[] args) {
        sayHello();
        sumOfTwoInt(5,7);
    }

    static void sayHello() {
        System.out.println("Hi There !");
    }

    static void sumOfTwoInt(int num1, int num2) {
        int numOne = num1;
        int numTwo = num2;
        int sum = numOne + numTwo;
        System.out.println(sum);
    }
}