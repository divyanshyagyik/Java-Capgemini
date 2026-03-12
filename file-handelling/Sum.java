import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter any number : ");
        try{
        for(int i=1;i<=5;i++) {
            try {
                int n = sc.nextInt();
                sum += n;
            } catch (InputMismatchException e) {
                System.out.println("Input Mismatch ");
                sc.next();
                i--;
            }
        }
        System.out.println("Sum : "+sum);
        }catch (NoSuchElementException | IllegalStateException e){
            System.out.println("Scanner closed, Sum cannot be calculated");
        }catch (Exception e){
            System.out.println("Some error occurred : "+e);
        }finally {
            sc.close();
        }
    }
}
