package requerimiento1;

public class Area {
    public Area() {
        super();
    }

    public static void main(String[] args) {
        Area area = new Area();
        int b=4, a=3;
        int areaRectangulo = b*a;
        int areaTriangulo = areaRectangulo/2;
                        
        System.out.println("AREA DEL RECTANGULO: -> " + areaRectangulo);
        System.out.println("AREA DEL TRIANGULO: -> " + areaTriangulo);
    }
}
