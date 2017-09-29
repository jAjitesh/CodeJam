import java.util.Scanner;




   




public class Steps {
	 public static int fact(int x){
	        if(x == 0 || x== 1){
	            return 1;
	        }
	        else{
	            return x * fact(x-1);
	        }
	    }
	    public static int climbStairs(int n) {
	        
	            int sum = 0;
	            int x = n;
	            int y = 0;
	            while(x>=0){
	                sum = sum + (fact(n)/(fact(x)*fact(y)));
	                n--;
	                y++;
	                x = x-2;
	        }
	        
	            return sum;
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(climbStairs(n));

	}

}
