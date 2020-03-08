package pink.digitally.rocktrumpet.examples;

import pink.digitally.rocktrumpet.annotations.MethodDescription;
import pink.digitally.rocktrumpet.annotations.PageTitle;
import pink.digitally.rocktrumpet.annotations.Summary;

@PageTitle(value = "Hello World", documentNumber = "1",
        subHeading = "First java program",
        summary = @Summary("The most basic java project"))
public class HelloWorld {

    @MethodDescription(pre = "Every java program needs a **main** method. A **main** method in java " +
            "needs to be **public** **static** and **void**. It must also take an array of strings as an argument",
    post = "When this program is run, 'Hello World' will be printed.")
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
