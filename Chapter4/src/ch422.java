
public class ch422 {
    public static void main(String[] args) {
        int n = 1;
        
        System.out.println("N\t\t10*N\t\t100*N\t\t1000*N\n");
        
        while (n <= 5){
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\n", n, (n *10), (n *100),(n *1000));
            ++n;
        }
            
    }
    
}
