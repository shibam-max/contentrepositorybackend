package com.example.contentsubmission.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
    private String title;

    
    private String description;

    private String mockFileLink;

    // Constructors, getters, and setters

    public content() {
        // Default constructor needed by JPA
    }

    public content(String title, String description, String mockFileLink) {
        this.title = title;
        this.description = description;
        this.mockFileLink = mockFileLink;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMockFileLink() {
        return mockFileLink;
    }

    public void setMockFileLink(String mockFileLink) {
        this.mockFileLink = mockFileLink;
    }
}
