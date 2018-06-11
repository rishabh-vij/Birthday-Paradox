public class Birthday
{
    public static final int NUMBER_OF_TRIES = 100000;

    /** Returns the day of the next birthday, an integer in the range 
	[0,364]
    */
    public static int nextBirthday() {
	return  (int)(Math.random()*365);
    }

    public static void main(String[] args) {
	int sum = 0;
	for (int k = 0; k < NUMBER_OF_TRIES; k++) {
	    int[] days = new int[365];
	    int n = 1;
	    int w = nextBirthday();
	    while (days[w] == 0) {
		days[w] = 1;
		w = nextBirthday();
		n++;
	    }
	    sum += n;
	}
	System.out.println("Average n = " + (double)sum/NUMBER_OF_TRIES);
    }
}

/** The Birthday Paradox: how it does not take many people to find two 
with the same birthday.
With this program we get that on average it is 24.62398
*/