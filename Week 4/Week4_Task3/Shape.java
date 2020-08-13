
package Week4_Task3;


public abstract class Shape {
    
    protected String color;
    protected boolean filed;

    public Shape(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
    }

    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", filed=" + filed +
                '}';
    }
    
     public abstract double getArea();
    public abstract double getParameter();
    
}

