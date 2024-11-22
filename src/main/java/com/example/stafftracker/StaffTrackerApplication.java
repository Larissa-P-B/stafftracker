package com.example.stafftracker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaffTrackerApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(StaffTrackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        System.out.println("***********************************");
        System.out.println("🚀 Staff Tracker Application Started!");
        System.out.println("📚 Access  at: http://localhost:8080/employees");
        System.out.println("***********************************");
    }



}
