package org.mykhailomi.max_palindromic_number.app;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mykhailomi.max_palindromic_number.app.conf.AppConfiguration;
import org.mykhailomi.max_palindromic_number.palindromic_number.MaxPalindromicNumberOfTwoPrimeNumbersProductFinder;
import org.mykhailomi.max_palindromic_number.palindromic_number.MaxPalindromicNumberOfTwoPrimeNumbersProductFinder.PalindromicNumber;
import org.mykhailomi.max_palindromic_number.prime_number.PrimeNumbersFinder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		PrimeNumbersFinder primeNumbersFinder = ctx.getBean("primeNumbersFinder", PrimeNumbersFinder.class);
		List<Integer> primeNumbers = primeNumbersFinder.find(10_000, 100_000, 100);
		
		MaxPalindromicNumberOfTwoPrimeNumbersProductFinder maxPalindromicNumberOfTwoPrimeNumbersProductFinder = ctx.getBean("maxPalindromicNumberOfTwoPrimeNumbersProductFinder", MaxPalindromicNumberOfTwoPrimeNumbersProductFinder.class);
		PalindromicNumber palindromicNumber = maxPalindromicNumberOfTwoPrimeNumbersProductFinder.find(primeNumbers);

		LOGGER.info("palindromicNumber={}", palindromicNumber);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
