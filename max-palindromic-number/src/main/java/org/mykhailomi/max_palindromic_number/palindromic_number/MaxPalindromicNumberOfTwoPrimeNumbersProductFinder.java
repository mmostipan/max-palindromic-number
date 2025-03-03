package org.mykhailomi.max_palindromic_number.palindromic_number;

import java.util.List;

public interface MaxPalindromicNumberOfTwoPrimeNumbersProductFinder {
	
	PalindromicNumber find(List<Integer> primeNumbers);
	
	public class PalindromicNumber {
		
		private final int multiplier1; 
		
		private final int multiplier2;
		
		private final long product;

		public PalindromicNumber(int multiplier1, int multiplier2, long product) {
			this.multiplier1 = multiplier1;
			this.multiplier2 = multiplier2;
			this.product = product;
		}

		public int getMultiplier1() {
			return multiplier1;
		}

		public int getMultiplier2() {
			return multiplier2;
		}

		public long getProduct() {
			return product;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("PalindromicNumber [multiplier1=");
			builder.append(multiplier1);
			builder.append(", multiplier2=");
			builder.append(multiplier2);
			builder.append(", product=");
			builder.append(product);
			builder.append("]");
			return builder.toString();
		}
	}
	
}
