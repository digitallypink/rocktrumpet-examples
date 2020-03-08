# Spring Boot Application

```java
@SpringBootApplication()
public class Application {
    
    public Application() {
        super();
    }
    
        public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean(value = "books")
    public List<String> getBooks() {
        return new ArrayList<>();
    }
}
```

This is all that is needed to start the application.

```java
public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
}
```


