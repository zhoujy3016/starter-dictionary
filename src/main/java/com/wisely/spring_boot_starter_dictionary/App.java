package com.wisely.spring_boot_starter_dictionary;

import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@Import({com.wisely.spring_boot_starter_dictionary.DictCacheConfiguration.class})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
