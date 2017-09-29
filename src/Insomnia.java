import java.util.HashMap;
import java.util.Scanner;


public class Insomnia {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Integer, Boolean> found = new HashMap<Integer, Boolean>();
		int n = s.nextInt();
		
		int temp = n;
		int i=1;
		while(found.keySet().size() < 10){
			temp = n*i;
			while (temp > 0) {
			    if(!found.containsKey(temp%10)){
				found.put(temp % 10, true);
			    
			}
			    temp = temp / 10;    
			}
			
			i++;
		}
		System.out.println(n*(i-1));
	}

}
