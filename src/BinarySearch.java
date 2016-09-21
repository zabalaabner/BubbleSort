import java.util.Scanner;
import java.util.Random;


public class BinarySearch {
public int []Array ;
public int left   = 0;
public int right  = Array.length - 1;
public int middle = 0;
public int search = 0;


public void setter (int Arraysize){
	Array = new int [Arraysize];
	Random rand = new Random ();
	for (int i = 0; i < Arraysize; i++)
	{Array [i] = rand.nextInt(100);}
}
	


public void Full (int Arraysize){
	while (left <= right){
		middle = (left + right)/2;
		
		if (Array[middle] == search)
			System.out.println(" The answer is in " + middle);
		else if (Array[middle] < search)
			left = middle + 1;
		else 
			right = middle -1;
	}	
}
public static void main(String[]Args){
	Scanner input = new Scanner (System.in);
	BinarySearch storage = new BinarySearch();
		System.out.println("Enter the Array size: ");
		int Arraysize = input.nextInt();
		storage.setter(Arraysize);
		System.out.println(Arraysize + "number of random numbers generated");
		System.out.println("Enter what number you want to find: ");
		
}
		

}

