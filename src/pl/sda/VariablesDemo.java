package pl.sda;

public class VariablesDemo {
    public static void main(String[] args) {
        long a = 0x7f888888;
        int b = 0x7f888888;
        short c = 0x7f88;
        byte d = 0x7f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();
        System.out.println(a * 2);
        System.out.println((long) b * 2);
        System.out.println(c * 2);
        System.out.println(d * 2);
    }
}
