package requerimiento4;

public class Area {
    
    private Double areaR; 
    private Double areaT;
    private Double base;
    private Double altura;
    
    public Area() {
        super();
        areaR = new Double(0.0);
        areaT = new Double(0.0);
        base = new Double(1.0);
        altura = new Double(1.0);
    }

    public void calcular_areas() {
        areaR = base * altura;
        areaT = areaR / 2;
    }

    public Double getAreaR() {
        if (areaR > 789.5) {
            System.out.println("El area supera el valor permitido");
            return 0.0;
        } else {
            return areaR;
        }
    }

    public Double getAreaT() {
        return areaT;
    }

    public void setBase(Double base) {
        if (base <= 0) {
            System.out.println("Debe ingresar un valor mayor a 0");
        } else {
            this.base = base;
        }
    }

    public void setAltura(Double altura) {
        if (altura <= 0) {
            System.out.println("Debe ingresar un valor mayor a 0");
        } else {
            this.altura = altura;
        }
    }
}