package vbeast.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by varun on 7/9/18.
 */

@SpringBootApplication(scanBasePackages = "vbeast.pro")
public class Launcher {
    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}
