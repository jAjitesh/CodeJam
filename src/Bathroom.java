import java.util.Scanner;


public class Bathroom {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		boolean[] arr = new boolean[n+2];
		arr[0]   = true;
		arr[n+1] = true;
		int temp1 = n/2;
		int temp2 = n/2;
		if(n%2 == 0){
			arr[n/2] = true;
		}
		else{
			arr[n/2 + 1] = true;
		}
		for(int i = 2; i <= k; i++){
			if(n % 2 != 0){
			if(i%2 == 0 && temp1 % 2 == 0){
				temp1 = temp1/2;
				arr[temp1] = true;
			}
			else if(i%2 == 0 && temp1 % 2 != 0){
				temp1 = temp1/2;
				arr[temp1 + 1] = true;
			}
			else if(i%2 != 0 && temp2 % 2 == 0){
				temp2 = temp2/2;
				arr[temp2 + 1 - n/2] = true;
			}
			else if(i%2 != 0 && temp2 % 2 != 0){
				temp2 = temp2/2;
				arr[temp2 + 1 + n/2 + 1] = true;
			}
			}
		}
	}

}
