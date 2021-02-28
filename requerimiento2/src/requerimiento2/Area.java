package requerimiento2;

import java.util.Scanner;

public class Area {
    public Area() {
        super();
    }

    public static void main(String[] args) {
        Area area = new Area();
        float base = 0;
        float altura = 0;

        float areaReact = 0;
        float areaTrian = 0;

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
