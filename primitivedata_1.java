class PrimitiveData {

    
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private boolean bool;

   
    public void setByte(byte b) {
        this.b = b;
    }

    public void setShort(short s) {
        this.s = s;
    }

    public void setInt(int i) {
        this.i = i;
    }

    public void setLong(long l) {
        this.l = l;
    }

    public void setFloat(float f) {
        this.f = f;
    }

    public void setDouble(double d) {
        this.d = d;
    }

    public void setChar(char c) {
        this.c = c;
    }

    public void setBoolean(boolean bool) {
        this.bool = bool;
    }

    // Getter methods
    public byte getByte() {
        return b;
    }

    public short getShort() {
        return s;
    }

    public int getInt() {
        return i;
    }

    public long getLong() {
        return l;
    }

    public float getFloat() {
        return f;
    }

    public double getDouble() {
        return d;
    }

    public char getChar() {
        return c;
    }

    public boolean getBoolean() {
        return bool;
    }
}

public class primitivedata_1 {
    public static void main(String[] args) {

        PrimitiveData obj = new PrimitiveData();

       
        obj.setByte((byte)10);
        obj.setShort((short)200);
        obj.setInt(5000);
        obj.setLong(100000L);
        obj.setFloat(5.5f);
        obj.setDouble(99.99);
        obj.setChar('A');
        obj.setBoolean(true);

        
        System.out.println("Byte: " + obj.getByte());
        System.out.println("Short: " + obj.getShort());
        System.out.println("Int: " + obj.getInt());
        System.out.println("Long: " + obj.getLong());
        System.out.println("Float: " + obj.getFloat());
        System.out.println("Double: " + obj.getDouble());
        System.out.println("Char: " + obj.getChar());
        System.out.println("Boolean: " + obj.getBoolean());
    }
}
