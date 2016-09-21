package com.log4jtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Hello {
	private static final Logger LOGGER = LogManager.getLogger(Hello.class);
	
	private static final Logger SECOND_LOGGER = LogManager.getLogger("rollingFilesLogger");
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LOGGER.trace("Hello World!");

		for (int i = 0; i < 2; i++) {
			String name = "Testing Logging";
			LOGGER.debug("debug {}", name);
			LOGGER.info("Info");
			LOGGER.warn("warn");
			LOGGER.error("error");
			SECOND_LOGGER.debug("second debug");
			SECOND_LOGGER.warn("second warn");
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