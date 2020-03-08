# All Access Endpoint

In the class below **@RestController** is used to return the resource object. **@RequestMapping** defines the base context path for all the requests in this class

```java
@RestController()
@RequestMapping(value = "/books")
public class AllUsersController {
    
    @Autowired()
    private List<String> books;
    
        @GetMapping()
    public List<String> getBooks() {
        return books;
    }
    
        @PostMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public List<String> addBooks(@RequestBody()
    String book) {
        books.add(book);
        return books;
    }
}
```

The *@GetMapping* below defines an endpoint that would be received using a GET request. Requesting *localhost:8080/books* in a browser will call this method.

```java
@GetMapping()
public List<String> getBooks() {
    return books;
}
```

This method is more difficult to call. I recommend using a tool like [Postman](https://www.postman.com/)

```java
@PostMapping()
@ResponseStatus(value = HttpStatus.CREATED)
public List<String> addBooks(@RequestBody()
String book) {
    books.add(book);
    return books;
}
```

The above method allows the user insert books through our /books endpoint.
