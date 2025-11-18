public class Practice {
    public static void main(String[] args) {
        int color = 0xc42F6D;
        int blueMask = 0x0000FF;

        int blue = color & blueMask;

        int greenMask = 0x00FF00;
        int green = (color & greenMask) >> 8;
        
        System.out.println(Integer.toHexString(green));
        // System.out.println(Integer.toHexString(blue));
        // Binary literal
        // int x = 0b10101;
        // int p = 0b11001;

        // int q = x & p;  
        // System.out.println(Integer.toBinaryString(q));
        
        // // Hexadecimal literal
        // int y = 0xcf4e;
        // // Integer literal
        // int z = 94;

        

        // //System.out.println(x);
        // System.out.println(Integer.toBinaryString(z));
        // System.out.println(Integer.toHexString(z));
        
    }
}