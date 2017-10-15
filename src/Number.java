/*Program is used to find aliquot sum of given number
 * Aliquot sum = sum of aliquot divisors of given number 
 * aliquot divisors = all divisors except number itself
 * we also check whether number is perfect or not
 * perfect number is the one in which sum of divisors = number itself
 * we have to also print perfect numbers from 1 to 100
 * @author - Soham Dixit
 * */

import java.util.Scanner;     


public class Number {           //base class
	
	int i,sum=0;                //initializing variables
	
	void divisors(int num) {   //method of a class to check aliquot sum and perfect number
		
		System.out.print("Divisors are -> ");
		
		for(i=1;i<num;i++) {     //checking whether number is perfect or not
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;        //for calculating sum
			}
		}
		
		System.out.println("\nSum -> "+sum);   //printing sum
		
		if(num==sum)         //condition to see whether number is perfect or not
		{
			System.out.println("Entered number is a PERFECT NUMBER");
		}
		else             // if num!=sum then else runs and prints not a perfect number
		{
			System.out.println("Entered number is not a PERFECT NUMBER");
		}
		
	}
	
	void list_num()       //method to print perfect number from 1 to 100
	{
		int s,j;
		for(i=1;i<=100;i++) {      //loop runs till 100
		s=0;
				for(j=1;j<i;j++)  //inner loop
				{
					if(i%j==0)  //condition
					{
						s=s+j;   //calculating sum for further checking
					}
				}
					if(s==i)  //condition to check whether number is perfect or not
					{
						System.out.print(i+" ");  //prints if number is perfwct
					}
			}
		
	}

	public static void main(String[] args) {   //main
		int num;       
		System.out.print("Enter a number -> ");   //inputing number
		Scanner sc = new Scanner(System.in);  
		num = sc.nextInt();  //taking input of entered number
		
		Number n = new Number();  //creating object of class to access methods
		
		n.divisors(num);  //calling divisors method of class and passing entered num
		
		System.out.print("\nPerfect Numbers between 1 to 100 -> ");  //printing perfect numbers between 1 to 100
		n.list_num(); //calling method of class which prints perfect numbers between 1 to 100
		
	}

}
