package com.bookSystem.bookSystem.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = 30, unique = true)
    private String title;

    @Column(name = "publish_date", nullable = false)
    private LocalDate publishDate;

    @Column(name = "price", nullable = false)
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
    private List<Customer> customers;

    public Book() {
    }

    public Book(Long id, String title, LocalDate publishDate, double price, Author author, List<Customer> customers) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.price = price;
        this.author = author;
        this.customers = customers;
    }

    public Book(String title, LocalDate publishDate, double price, Author author, List<Customer> customers) {
        this.title = title;
        this.publishDate = publishDate;
        this.price = price;
        this.author = author;
        this.customers = customers;
    }

    public Book(String title, LocalDate publishDate, double price, Author author) {
        this.title = title;
        this.publishDate = publishDate;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", price=" + price +
                '}';
    }
}
