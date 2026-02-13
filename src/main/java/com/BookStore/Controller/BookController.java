package com.BookStore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        // template file is named bookRegister.html (CamelCase), so return that name here
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public String getAllBook() {
        return "bookList";
    }
}
