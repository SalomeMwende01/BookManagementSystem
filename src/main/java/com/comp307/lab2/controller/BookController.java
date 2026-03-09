package com.comp307.lab2.controller;

import com.comp307.lab2.model.Book;
import com.comp307.lab2.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Display all books
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listBooks", bookRepository.findAll());
        return "index";
    }

    // Show form to add book
    @GetMapping("/showNewBookForm")
    public String showNewBookForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "new_book";
    }

    // Save book
    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }

    // Delete book
    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
        return "redirect:/";
    }
    
    //Update book
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable Long id, Model model) {

        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid book Id:" + id));

        model.addAttribute("book", book);
        return "update_book";
    }

    @PostMapping("/updateBook")
    public String updateBook(@ModelAttribute("book") Book book) {

        bookRepository.save(book);
        return "redirect:/";
    }
    
    @GetMapping("/search")
    public String searchBooks(@RequestParam("keyword") String keyword, Model model) {

        model.addAttribute("listBooks", bookRepository.findByTitleContainingIgnoreCase(keyword));
        model.addAttribute("keyword", keyword);

        return "index";
    }
}