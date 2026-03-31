

public class Primitive_Variables {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        double myDoubleNum = 5.99;   // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String (text)
        byte myByte = 100;          // Byte (whole number from -128 to 127)
        short myShort = 5000;       // Short (whole number from -32,768 to 32,767)
        long myLong = 15000000000L; // Long (whole number from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        System.out.println(myByte+myNum+myDoubleNum+myShort+myLong);
        System.out.println(myLetter);
        System.out.println(myText);
    }
}
