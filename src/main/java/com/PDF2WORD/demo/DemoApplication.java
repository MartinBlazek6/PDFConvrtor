package com.PDF2WORD.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class DemoApplication extends JFrame {

	public static void main(String[] args) {
		//new File(UploadController.uploadDirectory).mkdir();
		SpringApplication.run(DemoApplication.class, args);
	}

}