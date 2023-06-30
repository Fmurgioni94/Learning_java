public class ReturnValues {
    public static void main(String[] args) {
        System.out.printf("The area is: %.2f \n", calcArea(2.3, 3.5));
    }

    public static double calcArea(double length, double width) {
        return length * width;
    }
}
