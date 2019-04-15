package com.assurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class Sample 
{
    public static void main( String[] args )
    {
       SpringApplication.run(Sample.class, args);
    }
}