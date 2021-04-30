import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int x=0;
		System.out.println("Enter the number : ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		if(n==0 || n==1)
		{
				System.out.println(n+" is not a prime number.");
		}
		else
		{
		for(int i=2;i<n/2;i++){
			if(n%i==0)
			{
				x++;
				break;
			}
		
		}
		if(x>0)
			System.out.println(n+" is not a prime number.");
			if(x==0)
				System.out.println(n+" is a prime number.");
	}
	}
}