class TypeCasting 
{
    public static void main(String[] args)
    {
        // Type casting : Means we had to do it ourselves.

        byte by = 125;

        int a = 257;
        byte k = (byte) a; // Conversion.  happens with modulo "%".

        float f = 34.5f;
        int t = (int) f;
        System.out.println(t);

        // Type Conversion happens explicitly.

        // There are type promotions
        byte c = 12; 
        byte b = 10; 
        int result = c * b; 
        System.out.println(result);
    }
}