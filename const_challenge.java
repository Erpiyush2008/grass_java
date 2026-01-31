class Cylinder {

   
    private int radius;
    private int height;


    public Cylinder() {
        this.radius = 1;
        this.height = 1;
    }

  
    public Cylinder(int r) {
        this.radius = r;
        this.height = 1;
    }

    public Cylinder(int r, int h) {
        this.radius = r;
        this.height = h;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public void setDimensions(int r, int h) {
        this.radius = r;
        this.height = h;
    }
}


public class const_challenge {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(5);
        Cylinder c3 = new Cylinder(3, 7);

        c1.setDimensions(2, 4);

        System.out.println("Cylinder 1 -> Radius: " + c1.getRadius() + ", Height: " + c1.getHeight());
        System.out.println("Cylinder 2 -> Radius: " + c2.getRadius() + ", Height: " + c2.getHeight());
        System.out.println("Cylinder 3 -> Radius: " + c3.getRadius() + ", Height: " + c3.getHeight());
    }
}
