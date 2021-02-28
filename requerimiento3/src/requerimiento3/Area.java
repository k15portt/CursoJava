package requerimiento3;

import java.util.Scanner;

public class Area {
    public Area() {
        super();
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.calcular();
    }

    private void calcular() {
        double altura = 0, base = 0, areaR = 0, areaT = 0;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del Base: ");
            base = leer.nextDouble();
            System.out.println("Ingrese el valor del Altura: ");
            altura = leer.nextDouble();
        }
        areaR = base * altura;
        areaT = areaR / 2;
        if (areaR > 367.5) {
            System.out.println("El valor del Area a superado el valor permitido");
        } else {
            System.out.println("Area del Rectángulo: -> " + areaR);
            System.out.println("Area del Triángulo: -> " + areaT);
        }
    }

}
