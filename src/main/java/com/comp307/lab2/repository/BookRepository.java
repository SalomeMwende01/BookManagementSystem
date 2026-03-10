/*
Student Name: Salome Mwende
Registration Number: IN13/00012/23
GitHub Repository: https://github.com/SalomeMwende01/BookManagementSystem

Description:
This interface provides database operations for the Book entity.
It extends JpaRepository which provides built-in CRUD operations

*/
package com.comp307.lab2.repository;

import com.comp307.lab2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitleContainingIgnoreCase(String keyword);

}