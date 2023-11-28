package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Set<String> phones = new HashSet<>();
        phones.add("Айфон");
        phones.add("ЛДжи");
        phones.add("Самсунг");
        phones.add("Ксиоми");
        phones.add("Реалми");

        Iterator<String> iterator = phones.iterator();

        String searchElement = "ЛДжи";

        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals(searchElement)){
                iterator.remove();
            }
        }

        Iterator<String> iterator1 = phones.iterator();
        iterator1.forEachRemaining(System.out::println);

    }
}
