//-----------------------------------------------------
// Title: DemoApplication
// Author: Deniz Dumanlı
// ID: 25337236168
// Section: 1
// Description: This class to run the program.
//-----------------------------------------------------
package com.opentechnica.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Demo application for CMPE-328
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//It runs the spring application.
		SpringApplication.run(DemoApplication.class, args);
	}

}
