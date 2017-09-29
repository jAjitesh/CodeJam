import java.util.Scanner;


public class Flippers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		String[] arrayStrings = new String[size];
		int[] arrayKs = new int[size];
		s.nextLine();
		for(int x = 0; x < size; x++){
			String line = s.nextLine();
			arrayStrings[x] = line.split(" ")[0];
			arrayKs[x] = Integer.parseInt(line.split(" ")[1]);
		}
		
		for(int c = 0; c < size; c++){
			String str = arrayStrings[c];
			int k = arrayKs[c];
			int count =0;
			char[] c_arr = str.toCharArray();
			for(int i=0;i<c_arr.length;i++){
				if(c_arr[i] == '-'){
					

					if(k+i > c_arr.length){
						break;
					}
					
				for(int j=i; j<k+i; j++){
					if(c_arr[j] == '+'){
						c_arr[j] = '-';
					}else {
						c_arr[j] = '+';
					}
				}
					count++;
			}
			}
			String res = String.valueOf(c_arr);
			if(res.contains("-")){
				 System.out.println("Case #" + (c + 1) + ": Impossible");
			}
			else{
				System.out.println("Case #" + (c + 1) + ": " + count);
			}
		}
		

	}

}
