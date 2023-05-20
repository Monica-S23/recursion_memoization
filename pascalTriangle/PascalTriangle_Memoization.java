package pascalTriangle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PascalTriangle_Memoization {
	
	private static Map<String, Integer> cache = new HashMap<>();
	
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
	    Scanner sc = new Scanner(System.in);
	
	    int row = sc.nextInt();
	    show(row);
	    sc.close();
	}

	public static void show(int num) {
		for(int i = 0; i < num; i++) {
			for(int j=num;j>i;j--) {
				System.out.print(" ");
			}
	        for(int k = 0; k <= i; k++) {
	            System.out.print(pascalTriangle(i, k) + " ");
	        }
	        System.out.println();
		}
	}
	public static int pascalTriangle(int i, int k) {
		String id= "" +i+k;
		
		if(cache.containsKey(id)){
			return cache.get(id);
		}
		
		if(k == 0 || k == i){
			return 1;
		}
	    else{ 
	    	int result =pascalTriangle(i - 1, k - 1) + pascalTriangle(i - 1, k);
	    	cache.put(id, result);
	    	return result;
	    }
	     
	   }
	   	
	}
