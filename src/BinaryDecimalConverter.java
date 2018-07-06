public class BinaryDecimalConverter {

    public static void main(String[] args){
        String binaryNumber = "101";
        
        System.out.println("Binary Number is: " +binaryNumber);
        System.out.println("Decimal equivalent of " +binaryNumber + "is: " + Integer.parseInt(binaryNumber, 2));
    }
    
}
