package org.mykhailomi.max_palindromic_number.palindromic_number;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("maxPalindromicNumberOfTwoPrimeNumbersProductFinder")
public class MaxPalindromicNumberOfTwoPrimeNumbersProductFinderImpl implements MaxPalindromicNumberOfTwoPrimeNumbersProductFinder {
	
	private final PalindromicNumberChecker palindromicNumberChecker;
	
	public MaxPalindromicNumberOfTwoPrimeNumbersProductFinderImpl(PalindromicNumberChecker palindromicNumberChecker) {
		this.palindromicNumberChecker = palindromicNumberChecker;
	}
	
	@Override
	public PalindromicNumber find(List<Integer> primeNumbers) {
		PalindromicNumber maxPN = new PalindromicNumber(0, 0, 0);
		
		for (Integer primeNumber1 : primeNumbers) {
			for (Integer primeNumber2 : primeNumbers) {
				long product = primeNumber1.longValue() * primeNumber2.longValue();
				
				if (palindromicNumberChecker.isPalindrome(product) && maxPN.getProduct() < product) {
					maxPN = new PalindromicNumber(primeNumber1.intValue(), primeNumber2.intValue(), product);
				}
			}
		}
		
		return maxPN;
	}

}
