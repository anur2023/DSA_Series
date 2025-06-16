class Decimal_to_Binary {
    public static void main(String[] args) {
        int decimalNumber = 7;
        int i = 0;
        int answer = 0;
        while(decimalNumber != 0){
            int bit = decimalNumber & 1; // Get the last bit
            answer = (int) (bit * Math.pow(10,i) +answer);
            decimalNumber >>= 1; 
            i++;
        }
        System.out.println("Binary representation: " + answer);
    }
}