package com.capgemini.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.bookstore.bean.Book;
@Repository
public interface BookRepository extends  JpaRepository<Book, Integer>{

}
