public class Box {
    private int wide; // horizontal dimension
    private int high; // vertical dimension
    private int thick; // depth dimension

    // Parameterized constructor
    public Box(int w, int h, int t) {
        wide = w;
        high = h;
        thick = t;
    }

    // Default constructor
    public Box() {
        this(1,1,1);
    }
    // toString method
    public String toString() {
        return wide + "x" + high + "x" + thick;
    }
}


