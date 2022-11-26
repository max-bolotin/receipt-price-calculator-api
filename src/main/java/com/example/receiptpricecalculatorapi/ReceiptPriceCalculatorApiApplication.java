package com.example.receiptpricecalculatorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class ReceiptPriceCalculatorApiApplication {
/*    private static final String INPUT = "{\n" +
            "\"basePrice\": 5.99,\n" +
            "\"itemDescription\":\"Truffle Gourmet Pasta\",\n" +
            "\"units\":1,\n" +
            "\"itemId\":\"40133\"\n" +
            "},\n" +
            "{\n" +
            "\"basePrice\": 0.27,\n" +
            "\"itemDescription\":\"Roll\",\n" +
            "\"units\":4,\n" +
            "\"percentageDiscount\":35.0,\n" +
            "\"itemId\":\"300198\"\n" +
            "},\n" +
            "{\n" +
            "\"basePrice\": 2.89,\n" +
            "\"itemDescription\":\"Chocolate\",\n" +
            "\"units\":3,\n" +
            "\"itemId\":\"300858\"\n" +
            "},\n" +
            "{\n" +
            "\"basePrice\": 0.99,\n" +
            "\"itemDescription\":\"Soft Drink\",\n" +
            "\"percentageDiscount\":10.0,\n" +
            "\"itemId\":\"300158\"\n" +
            "},\n" +
            "{\n" +
            "\"basePrice\": 0.3,\n" +
            "\"itemDescription\":\"Yogurt\",\n" +
            "\"units\":6,\n" +
            "\"itemId\":\"300181\"\n" +
            "}";
    private static final String FILENAME = "input.txt";*/

    public static void main(String[] args) {
/*        Path path = Paths.get(FILENAME);
        try {
            Files.writeString(path, INPUT);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        SpringApplication.run(ReceiptPriceCalculatorApiApplication.class, args);
    }

}
