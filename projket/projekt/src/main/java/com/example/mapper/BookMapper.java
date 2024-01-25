package com.example.mapper;

import com.example.dto.BookDto;
import com.example.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements IMapEntities<BookDto,Book> {
     public Book mapToEntity(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        return book;
    }
    public BookDto mapToDto(Book book){
         BookDto bookDto = new BookDto();
         bookDto.setId(book.getId());
         bookDto.setAuthor(book.getAuthor());
         bookDto.setTitle(book.getTitle());
         return bookDto;
    }
}
