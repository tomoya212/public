package train;

public class Train {
	long x =0;

	long goForward(long up) throws ReversePositionException {
		x += up;
		if (x < 0.0) {
			throw new ReversePositionException();
		}
		return x;
	}
}
