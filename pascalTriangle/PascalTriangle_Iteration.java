package pascalTriangle;

import java.util.Scanner;

public class PascalTriangle_Iteration {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		pascalTriangle(row);
		sc.close();
	}
	public static void pascalTriangle(int num){
		
		for(int i=0;i<num;i++){
			
			for(int j=num;j>i;j--){
				System.out.print(" ");
			}
			int value=1;
	
			for(int k=0;k<=i;k++){
				System.out.print(value+" ");
				value = value*(i-k)/(k+1);
			}
			System.out.print("\n");
		}	
	}
}
