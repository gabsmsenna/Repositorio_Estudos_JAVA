package academy.nelioalves.cursojava.domain.KInterfaces.Example2.program;

import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.AbstractShape;
import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Circle;
import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Enum.Color;
import academy.nelioalves.cursojava.domain.KInterfaces.Example2.model.Rectangle;

public class Program {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
    }
}