package requerimiento4;

import java.util.Scanner;

public class Main {
    public Main() {
        super();
    }

    public static void main(String[] args) {
        Area area = new Area();

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del Base: ");
            area.setBase(leer.nextDouble());
            System.out.println("Ingrese el valor del Altura: ");
            area.setAltura(leer.nextDouble());
        }
        area.calcular_areas();
        System.out.println("Area del Rectángulo: -> " + area.getAreaR());
        System.out.println("Area del Triángulo: -> " + area.getAreaT());
    }
}
