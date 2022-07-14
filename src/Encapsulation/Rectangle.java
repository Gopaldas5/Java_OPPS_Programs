package Encapsulation;

public class Rectangle {

    //state
    private int length ;
    private int breadth;

    //creation
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //operations
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }


    public String toString(){
        return String.format("Length - %d, Breadth - %d,\n Area of a rectangle :- %d " +
                        "\n Perimeter of a rectangle :- %d",
                length,breadth,area(),perimeter());
    }
}
