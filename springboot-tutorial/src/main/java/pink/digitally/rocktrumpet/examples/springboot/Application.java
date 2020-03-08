package pink.digitally.rocktrumpet.examples.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pink.digitally.rocktrumpet.annotations.ClassDescription;
import pink.digitally.rocktrumpet.annotations.MethodDescription;
import pink.digitally.rocktrumpet.annotations.PageTitle;

import java.util.ArrayList;
import java.util.List;

@PageTitle(value = "Spring Boot Application", documentNumber = "1")
@ClassDescription(pre = "The annotation, **@SpringBootApplication** indicates the entry point for the application.")
@SpringBootApplication
public class Application {
    @MethodDescription(pre = "This is all that is needed to start the application.")
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @MethodDescription(pre = "In the method below, we define an Object that will be used in other classes")
    @Bean("books")
    public List<String> getBooks(){
        return new ArrayList<>();
    }
}
