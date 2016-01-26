
public class PrimeNumberCalculator {
	public static boolean isPrimeNumber(int testNumber) {
		//素数かどうかを判定する
		//boolean isPrimeNumber = true;
		for ( int i = 2; i < testNumber; i++ ) {
			if ( testNumber % i == 0 ) {
				//isPrimeNumber = false;
				//break;
				return false;
			}
		}

		//return isPrimeNumber;
		return true;
	}
}