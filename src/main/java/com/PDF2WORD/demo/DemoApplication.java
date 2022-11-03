package com.PDF2WORD.demo;

import com.PDF2WORD.demo.controller.UploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.io.File;

@SpringBootApplication
public class DemoApplication extends JFrame {

	public static void main(String[] args) {
		new File(UploadController.uploadDirectory).mkdir();
		SpringApplication.run(DemoApplication.class, args);
	}

}