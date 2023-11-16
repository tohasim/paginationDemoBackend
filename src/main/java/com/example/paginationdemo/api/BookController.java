package com.example.paginationdemo.api;

import com.example.paginationdemo.entity.Book;
import com.example.paginationdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public Page<Book> getAllBooks(@RequestParam(required = false) String author, Pageable pageable) {
        System.out.println("pageable = " + pageable); //Add a breakpoint here, and investigate the pageable instance
        return bookService.getAllBooks(pageable, author);
    }
}
