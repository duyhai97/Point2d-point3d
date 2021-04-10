import java.util.Arrays;
public class Point3D extends Point2D{
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){

    }
    public float[] getXYZ(){
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return super.toString() + " z bang: " + getZ();
    }

    public static void main(String[] args) {
        Point3D a = new Point3D(5, 6,7);
        System.out.println(Arrays.toString(a.getXYZ()));
        System.out.println(a.toString());
    }
}
