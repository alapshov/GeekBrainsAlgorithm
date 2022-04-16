package Task_5;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(result(5, 3));

    }

    public static int result(int number, int exp) {

        if (exp == 0)
            return 1;
        return result(number, exp - 1) * number;
    }
}
