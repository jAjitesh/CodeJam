import java.util.Scanner;

public class TidyNo {
	
	public static long tidyCheck(String number){
		char[] str = number.toCharArray();
		int breakIndex = 0;
		int startIndex = 0;
		
		for(int x = 0; x < str.length; x++){
			if(x == str.length - 1){
				return Long.parseLong(String.valueOf(str));
			}
			
			if(Integer.parseInt(String.valueOf(str[x])) > Integer.parseInt(String.valueOf(str[x + 1]))){
				breakIndex = x;
				break;
			}
		}
		
		startIndex = breakIndex;
		
		for(int y = breakIndex; y >= 0; y--){
			if(y == 0){
				break;
			}
			
			if(str[y] == str[y - 1]){
				startIndex = y - 1;
			}else{
				break;
			}
		}
		
		for(int z = startIndex + 1; z < str.length; z++){
			str[z] = '9';
		}
		
		str[startIndex] = Integer.toString((Integer.parseInt(String.valueOf(str[startIndex])) - 1)).charAt(0);
		
		return Long.parseLong(String.valueOf(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		String[] inputNumbers = new String[size];
		
		for(int i = 0; i < size; i++){
			inputNumbers[i] = s.next();
		}
		
		for(int c = 0; c < size; c++){
			System.out.println("Case #" + (c+1) + ": " + tidyCheck(inputNumbers[c]));	
		}
	}

}


