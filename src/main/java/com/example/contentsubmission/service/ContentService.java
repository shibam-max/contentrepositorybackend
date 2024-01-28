package com.example.contentsubmission.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contentsubmission.model.content;
import com.example.contentsubmission.repository.ContentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContentService {

    @Autowired
    private ContentRepository contentRepository;

    public content submitContent(content content) {
        return contentRepository.save(content);
    }

    public content previewContent(Long id) {
        Optional<content> optionalContent = contentRepository.findById(id);
        return optionalContent.orElse(null);
    }

    public List<content> getAllContent() {
        return contentRepository.findAll();
    }

    public void deleteContent(Long id) {
        contentRepository.deleteById(id);
    }
    
    
    
    public List<content> searchContentByTitleFromController(String title) {
        return contentRepository.findByTitleContainingIgnoreCase(title);
    }

}
