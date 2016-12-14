public class ch714
{
    public static void main(String[] args){

        int d1 = 5;
        int d2 = 7;
        int d3 = 12;
        int d4 = 16;
        
        System.out.println("d1 = 5\nd2 = 7\nd3 = 12\nd4 = 16\n");
        
        System.out.printf("The product of d1 * d2* d3 * d4 = %d\n", Product(d1,d2,d3,d4));
        System.out.printf("The product of d2* d3 * d4 = %d\n", Product(d2,d3,d4));
        System.out.printf("The product of d1 * d3 = %d\n", Product(d1,d3));
        
    }
    // returns the product of the arguments
    public static int Product(int... numbers){
        for(int i=1; i<numbers.length; i++){
            numbers[0] *= numbers[i];
        }
        return numbers[0];
    }
}