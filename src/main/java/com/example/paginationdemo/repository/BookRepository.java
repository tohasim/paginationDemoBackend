package com.example.paginationdemo.repository;

import com.example.paginationdemo.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {
    Page<Book> findBooksByAuthorLikeIgnoreCase(String author, Pageable pageable);
}
