import java.util.*;
public class Main {

	public static void main(String[] args) {
		for ( int testNumber = 2; testNumber <= 100; testNumber++ ) {
			//boolean isPrimeNumber = isPrimeNumber( testNumber );
			//素数を出力する
			if( PrimeNumberCalculator.isPrimeNumber( testNumber ) ) {
				System.out.println( testNumber );
			}
		}		
	}
}