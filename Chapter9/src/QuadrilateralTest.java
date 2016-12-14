import java.util.Scanner;
public class QuadrilateralTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int[] sides = new int[4];
        
        for (int i =0; i <=3; i++){
            System.out.printf("Enter the length of side %d: ",(i + 1));
        sides[i] = input.nextInt();}
        
        
            
                  
        System.out.println("Select a shape\n1. Square\n2. Rectangle\n3. Parellelogram\n4. Trapezoid");
        choice = input.nextInt();
        switch (choice){
            case 1:{
                Square square1 = new Square(sides);
                System.out.printf("Area = %d\nPerimeter = %d\n", square1.getArea(), square1.getPerimeter());
            }
                break;
            case 2:{
                Rectangle rec1 = new Rectangle(sides);
                System.out.printf("Area = %d\nPerimeter = %d\n", rec1.getArea(), rec1.getPerimeter());
            }
                break;
            case 3: {
                Parellelogram Parel1 = new Parellelogram(sides);
                System.out.printf("Area = %d\nPerimeter = %d\n", Parel1.getArea(), Parel1.getPerimeter());
            }
                break;
            case 4:{
                Trapezoid trap1 = new Trapezoid(sides);
                System.out.printf("Area = %.2f\nPerimeter = %d\n", trap1.getArea(), trap1.getPerimeter());
            }
            break;
        }
    }
}
