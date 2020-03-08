package pink.digitally.rocktrumpet.examples.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pink.digitally.rocktrumpet.annotations.ClassDescription;
import pink.digitally.rocktrumpet.annotations.MethodDescription;
import pink.digitally.rocktrumpet.annotations.PageTitle;

import java.util.List;

@PageTitle(value = "All Access Endpoint", documentNumber = "2")
@ClassDescription(pre = "In the class below *@RestController* is used to return the resource object. " +
        "*@RequestMapping* defines the base context path for all the requests in this class")
@RestController
@RequestMapping("/books")
public class AllUsersController {
    //This object has been defined in the Application class.
    @Autowired
    private List<String> books;

    @MethodDescription(pre = "The *@GetMapping* below defines an endpoint that would be received using a " +
            "GET request. Requesting *http://localhost:8080/books* in a browser will call this method.")
    @GetMapping
    public List<String> getBooks() {
        return books;
    }

    @MethodDescription(pre = "This method is more difficult to call. I recommend using a tool like [Postman](https://www.postman.com/)",
    post = "The above method allows the user insert books through our /books endpoint.")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<String> addBooks(@RequestBody String book) {
        books.add(book);
        return books;
    }
}
