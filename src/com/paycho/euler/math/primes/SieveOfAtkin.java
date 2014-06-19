
package com.paycho.euler.math.primes;

import com.google.inject.Inject;
import java.util.BitSet;

/**
 * @author Paycho <paycho@paycho.org>
 */
public class SieveOfAtkin implements Sieve {
 
  private BitSet isPrime;
  
  @Inject
  public SieveOfAtkin() {
  }

  @Override
	public Long findNthPrime(Long N) {

    Long nth = N;
    
    long sqrtLimit = (long) Math.sqrt(N) + 1;
    if (N <= 10000000L) {
      N = 10000000L;
      sqrtLimit = (long) Math.sqrt(N) + 1;
    }
    
    isPrime = new BitSet(32);


		// Find prime
		int[] sequence = { 2, 4 };
		int index = 0;
		int k1 = 0, k = 0;

		double sensibleUpperBound = Math.sqrt(N / 4) + 1;
		int x = 1;
		int y = 0;

		while (x < sensibleUpperBound) {
			index = 0;
			k1 = 4 * x * x;
			y = 1;
			if (x % 3 == 0) {
				while (true) {
					k = k1 + y * y;
					if (k >= N) {
						break;
					}
					isPrime.flip(k);
					y += sequence[(++index & 1)];
				}
			} else {
				while (true) {
					k = k1 + y * y;
					if (k >= N) {
						break;
					}
					isPrime.flip(k);
					y += 2;
				}
			}
			x++;
		}

		sensibleUpperBound = Math.sqrt(N / 3) + 1;
		x = 1;
		y = 0;

		while (x < sensibleUpperBound) {
			index = 1;
			k1 = 3 * x * x;
			y = 2;
			while (true) {
				k = k1 + y * y;
				if (k >= N) {
					break;
				}
				isPrime.flip(k);
				y += sequence[(++index & 1)];
			}
			x += 2;
		}

		sensibleUpperBound = (int) Math.sqrt(N);
		x = 1;
		y = 0;

		while (x < sensibleUpperBound) {
			k1 = 3 * x * x;
			if ((x & 1) == 0) {
				y = 1;
				index = 0;
			} else {
				y = 2;
				index = 1;
			}
			while (y < x) {
				k = k1 - y * y;
				if (k < N) {
					isPrime.flip(k);
				}
				y += sequence[(++index & 1)];
			}
			x++;
		}

		isPrime.set(2);
		isPrime.set(3);
		for (int n = 5; n <= sqrtLimit; n += 2) {
			if (isPrime.get(n)) {
				int n2 = n * n;
				for (k = n2; k < N; k += (2 * n2)) {
					isPrime.clear(k);
				}
			}
		}

		long pi = 1;
		for (long i = 3; i < N; i += 2) {
			if (isPrime.get(((Long) i).intValue())) {
				pi++;
        if (pi == nth) {
          return i;
        }
			}
		}
    return -1L;
	}
}
