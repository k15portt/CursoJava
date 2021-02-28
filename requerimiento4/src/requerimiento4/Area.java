package requerimiento4;

public class Area {
    public Area() {
        super();
    }

    private double areaR = 0, areaT = 0, base = 1, altura = 1;

    public void calcular_areas() {
        areaR = base * altura;
        areaT = areaR / 2;
    }

    public double getAreaR() {
        if (areaR > 789.5) {
            System.out.println("El area supera el valor permitido");
            return 0;
        } else {
            return areaR;
        }
    }

    public double getAreaT() {
        return areaT;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("Debe ingresar un valor mayor a 0");
        } else {
            this.base = base;
        }
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("Debe ingresar un valor mayor a 0");
        } else {
            this.altura = altura;
        }
    }
}
