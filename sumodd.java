package localRepo;

import java.util.Scanner;
public class sumodd {
    
    public static void main(String[] args) {
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numners of elements in the array");
        n=s.nextInt();
        int []a=new int[n];
        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++){

            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                sum=sum+a[i];
            }

        }
        System.err.println("sum of odd numbers:"+sum);

    }
}

