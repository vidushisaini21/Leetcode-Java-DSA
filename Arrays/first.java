

import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a+b)/2 > c || (b+c)/2 >a || (c+b)/2 > b){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
    }
}