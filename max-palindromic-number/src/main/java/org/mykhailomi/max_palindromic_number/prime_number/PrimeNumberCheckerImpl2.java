package org.mykhailomi.max_palindromic_number.prime_number;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component("primeNumberChecker2")
public class PrimeNumberCheckerImpl2 implements PrimeNumberChecker {

	@Override
	public boolean isPrime(int number, int certainty) {
		return BigInteger.valueOf(number).isProbablePrime(certainty);
	}

}
