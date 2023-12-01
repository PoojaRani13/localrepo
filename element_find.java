package localRepo;


    
import java.util.Scanner;

public class element_find {
    
    public static void main(String[] args) {
        int n,i,flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the element to be found");
        n=s.nextInt();
        int a[]={2,3,4,8,9};
    
        

        for(i=0;i<5;i++){

            if(a[i]==n){
            System.out.println("the element is found at position " +(i+1));
            flag=1;
            break;
            
            }
        
        }
             
       if (flag==0)
       System.out.println("not  found");
    }
}
