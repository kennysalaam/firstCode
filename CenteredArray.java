import java.util.Scanner;

public class CenteredArray{

	public static void main(String args[]){

		int equiValues[], equiSize;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  length of numbers to check: ");
		equiSize = input.nextInt();	
		
		equiValues = new int[equiSize];	

		System.out.println("Enter the  Elements in the Center Array: ");	
		for (int i=0; i<equiSize; i++){
			equiValues[i] = input.nextInt();
			//System.out.println("The Value of index["+i+"] is " + equiValues[i]);	
		}

		for (int i=0; i<equiSize; i++){
			//equiValues[i] = input.nextInt();
			System.out.println("The Value of index["+i+"] is " + equiValues[i]);	
		}


		System.out.println("The array is "+getCentered(equiValues));
	}


	private static int getCentered(int[] arrayValues){
		int indexCenter=0;
		//int midValue =0;
		int temp=0;

		indexCenter= arrayValues.length/2;

		if(arrayValues == null){
			return 0;
		}
		else if(arrayValues.length%2 == 0){
				return 0;
		}
		else if(arrayValues.length%2 == 1){
				temp=arrayValues[indexCenter];

				for(int i=0; i< arrayValues.length;i++){
					if(i!=indexCenter && temp > arrayValues[i])
						return 0;	
				}
			//return 1;
		}

		return 1;		
	}
}