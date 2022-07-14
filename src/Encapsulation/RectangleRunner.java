package Encapsulation;

public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,8);
        System.out.println(rectangle);
        System.out.println("-------------------------------------------------------");
        rectangle.setLength(25);
        rectangle.setBreadth(23);
        System.out.println(rectangle);
    }
}
