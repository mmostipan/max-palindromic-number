package org.mykhailomi.max_palindromic_number.prime_number;

import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

@Component("primeNumberChecker")
public class PrimeNumberCheckerImpl implements PrimeNumberChecker {

	@Override
	public boolean isPrime(int number, int certainty) {
		return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
	    		.noneMatch(n -> (number % n == 0));
	}

}
