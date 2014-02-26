package task4;

import java.util.Arrays;

public class Trash {
	
	public static void main(String [] args){
		
		//поменять зеркально массив 
		int [] arr = new int[]{1,2,3,4,5,6,7,8,9};	
		int [] arr2 = new int[arr.length];
		 
		for(int i = 0; i < arr.length; i++){  
			arr2[i] = arr[arr.length-1-i];
		}	 
		System.out.println("" + Arrays.toString(arr) + " | " + Arrays.toString(arr2));
		//----------------------------------------------------------------------------------------------------------- 
		//6. Написать программу, которая заполнит массив случайными числами, а затем выведет на экран сумму всех его элементов 
		//а) кроме 1-го и предпоследнего
		//б) значения которых больше 5. 
		int [] arr3 	= new int[]{1,2,3,4,5,6,7,8,9};	
		int sum 	= 0;
		
		for (int i=0;i<arr3.length;i++)
            arr3[i] = (int) ( Math.random() * arr3.length);
		
		for(int i = 1; i < arr3.length-1; i++){   
			sum += arr3[i];
		}		
		System.out.println("" + sum);
		sum = 0;
		for(int i = 0; i < arr3.length; i++){   
			if(arr3[i] > 5){
				sum += arr3[i];
			} 
		}		
		System.out.println("" + sum);
		//-----------------------------------------------------------------------------------------------------------   
		//7. Вывести на экран коды, соответствующие символам 'a'..'z'.
		 
		for (char c='a'; c<='z'; c++) {
		  System.out.println("code="+(int)c+"\tsumbol="+c);
		}
		//-----------------------------------------------------------------------------------------------------------  
		//8. Заполнить массив (случайными) числами. Посчитать количество последовательных элементов массива, для которых выполняется условие a + a[i+1] > 10.
		int [] arr1 = new int[10];	  
		for (int i=0;i<arr1.length;i++){
			arr1[i] = (int) ( Math.random() * arr1.length);
		}
        
		System.out.println("" + Arrays.toString(arr1) );
		int count = 0;
		for (int i=0;i<arr1.length;i++){

			if(i+1 < arr1.length && (arr1[i] + arr1[i+1]) > 10 ){
				count++;  
			}
		}		
		System.out.println(" "+ count );
	}

}


public class taks1 {
	
	/**
	 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	 */
	public static boolean checkNatural(int number){
		
		for(int i = 2; i < number; i++){ 
			if(number%i == 0){
				return false;
			}
		}		
		return true;
	}
	
	public static void main(String [] args){
			
		for(int i = 2; i < 100; i++){			
			
			if(checkNatural(i)){
				System.out.print(" "+i);
			}
		}	
		
		System.out.println(" ");
		System.out.println(" ");
		
		int inRow = 0;
		for(char ch = 'A'; ch <= 'Z'; ch++){	

			if(inRow == 4){
				inRow = 0;
				System.out.println(" ");
			}
			System.out.print(" "+ch);
			inRow++;
		}
	}	
}
