package requerimiento1;

public class Area {
    public Area() {
        super();
    }
    
    public static void main(String[] args){
        Area area = new Area();
        Integer b= new Integer(4), a=new Integer(3);
        Integer areaRectangulo = new Integer(b*a);
        Integer areaTriangulo = new Integer(areaRectangulo/2);
                        
        System.out.println("AREA DEL RECTANGULO: -> " + areaRectangulo.intValue());
        System.out.println("AREA DEL TRIANGULO: -> " + areaTriangulo.intValue());
    }
}
