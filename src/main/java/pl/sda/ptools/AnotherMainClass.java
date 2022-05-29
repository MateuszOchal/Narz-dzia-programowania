package pl.sda.ptools;

import org.slf4j.LoggerFactory;

public class AnotherMainClass {
    public static void main(String[] args) {
        LoggerFactory.getLogger(AnotherMainClass.class)
                .info("The application has started");
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello world " + i);
        }
    }
}
