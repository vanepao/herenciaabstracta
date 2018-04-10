package po.pductos;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle(){
        super();
     this.width= 0.0;
     this.lenght=0.0;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLenght(){
        return this.lenght;
    }
    public void setLenght(double lenght){
        this.lenght=lenght;
    }

    @Override
    public double getArea() {
        return lenght * width;
    }

    @Override
    public double getPerimeter() {
        return (lenght * width)/2;
    }

    @Override
    public String toString() {
        String relleno;
        if (this.filled) relleno = " está relleno\n";
        else relleno = " no está relleno\n";
        return "El rectángulo es color " + this.color + relleno;
    }

}
