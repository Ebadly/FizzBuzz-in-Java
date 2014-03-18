
public class FizzBuzz {
	public static void main(String[] args) {
		
        //printing numbers 1 through 100
		for(int i =1; i< 101; i++){
			if(i%3 == 0 && i%5==0) // if it is a multiple of 3 and 5
				System.out.println("FizzBuzz");
			else if(i%3==0) // if multiple of 3 only
				System.out.println("Fizz");
			else if(i%5==0)//if multiple of 5 only
				System.out.println("Buzz");
			else // if not a multiple of 3 and/or 5
				System.out.println(i);
		}
	}
}
