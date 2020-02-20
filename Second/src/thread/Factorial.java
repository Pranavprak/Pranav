package thread;
import java.util.*;
public class Factorial {
     int Fact(int num)
    {
    	 if(num==0)
    		 return 1;
    	 else
    	return num*Fact(num-1);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorial fa=new  Factorial();
        int a=fa.Fact(n);
        System.out.println(a);
       // sc.close();
        
	}

}
