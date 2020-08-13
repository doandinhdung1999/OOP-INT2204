
package Week4_Task3;


public class Square extends Rectangle {

    private boolean filled;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSize() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
    }
    
    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

        
    public String toString() {
        return "Square[side=" + width + ", color=" + color + ", filled=" + filled + "]";
        
    }
}