package org.mykhailomi.max_palindromic_number.palindromic_number;

import org.springframework.stereotype.Component;

@Component("palindromicNumberChecker")
public class PalindromicNumberCheckerImpl implements PalindromicNumberChecker {

	@Override
	public boolean isPalindrome(long number) {
		String string = String.valueOf(number);
		
		int start = 0;
		int end = string.length() - 1;

		while (start < end) {
			if (string.charAt(start) != string.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}

}
