import java.util.Scanner;


public class NoOfSquares {
public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	//int t = s.nextInt();
	
	//for(int j=0; j<t; j++){
		int r = s.nextInt();
		int c = s.nextInt();
		long res = (r - 1) * (c - 1);
	int i=2;
	while((r - i) > 0 && (c - i) > 0){
		res= res + i*((r - i) * (c - i));
		i++;
	}
	long x = (long)Math.pow(10, 9) + 7;
	System.out.println(res%x);

}}