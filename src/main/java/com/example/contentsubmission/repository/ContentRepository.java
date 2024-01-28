package com.example.contentsubmission.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contentsubmission.model.content;

public interface ContentRepository extends JpaRepository<content, Long> {

	List<content> findByTitleContainingIgnoreCase(String title);
	
}

