package requerimiento2;

import java.util.Scanner;

public class Area {
    public Area() {
        super();
    }

    public static void main(String[] args) {
        Float base = new Float(0.0);
        Float altura = new Float(0.0);
        Float areaReact = new Float(0.0);
        Float areaTrian = new Float(0.0);

        @SuppressWarnings("resource")
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor del Base: ");
        base = leer.nextFloat();
        System.out.println("Ingrese el valor del Altura: ");
        altura = leer.nextFloat();

        areaReact = base * altura;
        areaTrian = areaReact / 2;
        if (areaReact > 124.5) {
            System.out.println("El valor del Area a superado el valor permitido");
        } else {
            System.out.println("Area del Rectángulo: -> " + areaReact);
            System.out.println("Area del Triángulo: -> " + areaTrian);
        }

    }
}