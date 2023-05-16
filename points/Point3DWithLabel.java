package points;

public class Point3DWithLabel extends Point3D {
    String label;

    public Point3DWithLabel(int x, int y, int z, String label) {
        super(x, y, z);
        this.label = label;
    }

    @Override
    public String getPoints(){
        return String.format("Etykieta(%s) : %d,%d,%d",label,x,y,z);
    }

    @Override
    public String toString() {
        return "Point3DWithLabel{" +
                "label='" + label + '\'' +
                ", z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
