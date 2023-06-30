public class Parameters {
    public static void main(String[] args) {
        calcArea(2.3, 3.5);
        calcArea(1.6, 2.4);
        calcArea(2.6, 4.3);
    }

    public static void calcArea(double length, double width) {
        double rectArea = length * width;
        System.out.println(String.format("the Area of the rettangles that as a length of %.2f and a width of %.2f is: %.2f", length, width, rectArea));
    }
}