public class Three {

  public static void main(String[] args) {
    int max = 1000;

    for(int i = 1; i <= max; i++) {
      if(i % 3 == 0) {
	System.out.println("THREE:" + i);
      }else{
	int cnt = 0;
	int value = i;
	while(value != 0) {
	  value /= 10;
	  cnt++;
	}
	int d = 1;
	for(int j = 0; j < cnt; j++) {
	  d *= 10;
	}
	int v = i;
	while(v != 0) {
	  if(v / d == 3) {
	    System.out.println("THREE:" + i);
	    break;
	  }
	  v %= d;
	  d /= 10;
	}
      }
    }
  }
}
