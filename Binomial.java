/* THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A 
 * TUTOR OR CODE WRITTEN BY OTHER STUDENTS. Milap Naik */

//Solves Binomial Distribution problems recursively

public class Binomial
{
	public static int BinomialSolver(int n, int k)
	{    
		int sol1, mySol ;


		if ( n == 0 && k > 0/* the base cases */ ){
			return 0; // The readily available solution for the base case     
		}
		else if(k == 0 && n >= 0){
			return 1;
		}
		else{
			sol1 = BinomialSolver ( n-1, k-1 ) ;  // Solve a smaller problem

			mySol = sol1 + BinomialSolver (n-1, k) ;  // Use the solution of the smaller problem
                          					    	  // to solve the original problem
			return mySol;
		}
	}


	public static void testBinomial(int n, int k, int correct_res)
	{
        int res;
        System.out.print("" + n + " choose " + k + " = ");   
        
        if ((res = BinomialSolver(n, k)) != correct_res) 
        	System.out.println("" + correct_res + ", but your method returned " + res + " ERROR!!!"); 
        
        else System.out.println(correct_res + " OK");     
	}

	public static void main(String args[])
	{
		testBinomial(10, 5, 252 );
		testBinomial(5, 5, 1 );
		testBinomial(7, 5, 21 );
		testBinomial(3, 2, 3 );
		testBinomial(30, 2, 435 );
		testBinomial(76, 5, 18474840 );
		testBinomial(5, 6, 0 );

		System.out.println();
	}
}
