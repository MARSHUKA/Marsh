public class Swappingno3 {
    public static void main(String[] args) {
        int x=8;
        int y=10;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After swapping:"
        + " x = " + x + ", y = " + y);

        
    }
}
