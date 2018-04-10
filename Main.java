package po.pductos;

public class Main {

    public static void main(String[] args) {
	Circle circl = new Circle("rojo",false, 3);
	System.out.println("CIRCULO");
	System.out.println("Color:" + circl.color);
	System.out.println("Filled?:" + circl.filled);
	System.out.println("Radio:" + circl.radious);
	System.out.println("AREA: "+ circl.getArea() + " cm^2");
	System.out.println("PERIMETRO: "+ circl.getPerimeter() + " cm");
	System.out.println("");
		System.out.println(circl.toString());



		Rectangle rect = new Rectangle(5,3,"azul",true);
	System.out.println("RECTANGULO");
	System.out.println("Width:" + rect.width);
	System.out.println("lenght?:" + rect.lenght);
	System.out.println("color:" + rect.color);
	System.out.println("Filled?:" + rect.filled);
	System.out.println("AREA: "+ rect.getArea() + " cm^2");
	System.out.println("PERIMETRO: "+ rect.getPerimeter() + " cm");
	System.out.println("");
		System.out.println(rect.toString());



		Square sq = new Square(1,"naranja", false);
        System.out.println("SQUARE");
        System.out.println("Side:"+ sq.side);
        System.out.println("Color:" + sq.color);
        System.out.println("Filled?:" + sq.filled);
        System.out.println("AREA: "+ sq.getArea() + " cm^2");
        System.out.println("PERIMETRO: "+ sq.getPerimeter() + " cm");
        System.out.println("");
        System.out.println(sq.toString());

    }
    }

