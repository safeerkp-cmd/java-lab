public class Swap {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        System.out.println("Before Swapping:\na = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Afer Swapping:\na = " + a + ", b = " + b);
    }
}
