import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		if(n%2==0){
		    System.out.println("the number is even");
		}
		else if(n<0){
		    System.out.println("the number is inavlid");
		}
	}
}
