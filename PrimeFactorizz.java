import java.util.*;

public class PrimeFactorizz {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int num;
        System.out.println("Enter a num: ");
        num = scan.nextInt();
        //Reads the number entered by user

        //Main looping function for prime factorizz
        for(int div = 2; div < num; div += 1)
        //to check if num is divisible to div then increment by 1
        {
            while(num % div == 0)
            //if divisible divide
            {
                num = num / div;
                System.out.println(div);
            }
        }
        if(num !=1)
        //if not equal to 1
        {
          System.out.println(num);  
        }

    }
}
