

package com.example.contentsubmission.controller;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import com.example.contentsubmission.model.content;

import com.example.contentsubmission.service.ContentService;




import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @PostMapping("/submit")
    public content submitContent(@RequestBody content content) {
        return contentService.submitContent(content);
    }

    @GetMapping("/preview/{id}")
    public content previewContent(@PathVariable("id") Long id) {
        return contentService.previewContent(id);
    }

    @GetMapping("/all")
    public List<content> getAllContent() {
        return contentService.getAllContent();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContent(@PathVariable("id") Long id)  {
    	
        contentService.deleteContent(id);
        return "Content deleted successfully";
    }
    @GetMapping("/search")
    public List<content> searchContentByTitle(@RequestParam(name = "title") String title) {
        return contentService.searchContentByTitleFromController(title);
    }

}