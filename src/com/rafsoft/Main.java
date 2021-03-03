package com.rafsoft;

public class Main {

    public static void main(String[] args) {
    PCBuilder pcBuilder = new PCBuilder()
                        .setOs("Windows")
                        .setCoreNumber(4)
                        .setRAM(3);

    PC pc = pcBuilder.build();

    System.out.println(pc);


    }
}
