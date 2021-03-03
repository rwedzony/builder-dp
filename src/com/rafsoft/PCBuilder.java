package com.rafsoft;

public class PCBuilder {
    private String os = "";
    private String processor = "";
    private int coreNumber = 0;
    private int RAM = 0;
    private int cache = 0;

    public PCBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PCBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PCBuilder setCoreNumber(int coreNumber) {
        this.coreNumber = coreNumber;
        return this;
    }

    public PCBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public PCBuilder setCache(int cache) {
        this.cache = cache;
        return this;
    }

    public PC build(){
    return new PC(os,processor,coreNumber,RAM,cache);
    }



}