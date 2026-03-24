import java.util.Scanner;
import java.util.*;

public class SumOfSquareReturnInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        int input = sc.nextInt();
        int count = 0;
        int current = input;
        Set<Integer> visited = new HashSet<>();
        while(true){
           current = sumOfSquare(current);
            if(current == input){
                System.out.println(visited);
                System.out.println(count);
                break;
            }
            visited.add(current);
            count++;
            if(visited.contains(current)){
                System.out.println("Not Reachable");
                break;
            }

        }

    }
    public static int sumOfSquare(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num /=10;
        }
        return sum;
    }
}
