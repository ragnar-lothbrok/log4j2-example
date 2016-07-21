package com.log4jtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Hello {
	private static final Logger LOGGER = LogManager.getLogger(Hello.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.trace("Hello World!");

		for (int i = 0; i < 20; i++) {
			String name = "Testing Logging";
			LOGGER.debug("Hi, {}", name);
			LOGGER.info("Welcome to the Log4j test.");
			LOGGER.warn("Log4j warning message.");
			LOGGER.error("Log4j error message.");
			A a = new A();
			LOGGER.debug("{}",a);
		}
	}

	static class A {
		int a = 2;
		int b = 3;

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}

		@Override
		public String toString() {
			return "A [a=" + a + ", b=" + b + "]";
		}

	}
}