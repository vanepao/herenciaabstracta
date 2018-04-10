package po.pductos;

public class Square extends Shape {
    protected double side;
    public Square(){
        super();
        this.side=0.0;
    }
    public Square(double side,String color, boolean filled){
        super(color,filled);
        this.side=side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side=side;
    }
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        String relleno;
        if (this.filled) relleno = " está relleno\n";
        else relleno = " no está relleno\n";
        return "El cuadrado es color " + this.color + relleno;
    }
}
