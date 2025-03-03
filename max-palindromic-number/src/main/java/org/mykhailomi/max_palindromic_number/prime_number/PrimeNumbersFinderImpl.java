package org.mykhailomi.max_palindromic_number.prime_number;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("primeNumbersFinder")
public class PrimeNumbersFinderImpl implements PrimeNumbersFinder {
	private final PrimeNumberChecker primeNumberChecker;
	
	public PrimeNumbersFinderImpl(@Qualifier("primeNumberChecker2") PrimeNumberChecker primeNumberChecker) {
		this.primeNumberChecker = primeNumberChecker;
	}

	@Override
	public List<Integer> find(int rangeStart, int rangeEnd, int certainty) {
		return IntStream.rangeClosed(rangeStart, rangeEnd)
				.filter(number -> primeNumberChecker.isPrime(number, certainty))
				.boxed()
				.toList();
	}

}
