package com.sachin.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class UsermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermanagementApplication.class, args);
	}

    class Main {
        public static void main(String[] args) {
            String input = "Happy Holidays";
            // Non repeating characher : o, l, i, d, s
            Map<Character, Integer> result = new HashMap<>();
            for(int i=0; i< input.length(); i++) {
                if(result.get(input.charAt(i)) != null) {
                    result.put(input.charAt(i), 1);
                } else {
                    result.put(input.charAt(i), result.get(input.charAt(i) + 1));
                }
            }

            Set<Map.Entry<Character, Integer>> entries = result.entrySet();

            for(Map.Entry<Character, Integer> entry : entries ) {
                if(entry.getValue() == 1) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

}
