package com.example.helloworld;

import com.example.helloworld.Model.MyColor;
import com.example.helloworld.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements  CommandLineRunner {

    private final PrinterService printerService;
    private final MyColor myColor;

    @Autowired
    public HelloworldApplication(PrinterService printerService, MyColor myColor) {
        this.printerService = printerService;
        this.myColor = myColor;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printerService.log("hello");
        myColor.printColor();
    }
}
