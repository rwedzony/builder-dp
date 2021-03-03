package com.rafsoft;

public class PC {
    private String os;
    private String processor;
    private int coreNumber ;
    private int RAM;
    private int cache;

    public PC(String os, String processor, int coreNumber, int RAM, int cache) {
        this.os = os;
        this.processor = processor;
        this.coreNumber = coreNumber;
        this.RAM = RAM;
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "PC{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", coreNumber=" + coreNumber +
                ", RAM=" + RAM +
                ", cache=" + cache +
                '}';
    }
}
