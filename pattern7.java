import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
            int n = sc.nextInt(); // Read 'n' for each test case

            for (int i = 1; i <= n; i++) {
                
                for(int j=n-i+1;j>=1;j--)
                 {
                    System.out.print(j ); // Print stars in the same row
                }
                System.out.println(); // Move to the next row
            }
            
       
    }
}
