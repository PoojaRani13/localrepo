package localRepo;


    
import java.util.Scanner;

public class sort_0 {
    
    public static void main(String[] args) {
        int n,count=0;
        
        
        
        int a[]={0,1,1,1,0,0,1};
    
        n=a.length;

        for(int i=0;i<n;i++){

            if(a[i]==0){
             count++;
                       }  
        }            
            for( int i=0;i<count;i++)
            a[i]=0;

            for( int i=count;i<n;i++)
            a[i]=1;
        System.out.println("after sort");
          for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
    }
}
            
        
        
             
    
       
    

