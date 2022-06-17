package com.library.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.library.service.entity.Library;
import com.library.service.service.LibraryService;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
	
	@Autowired
	private LibraryService libraryService;
	
	@PostMapping("/")
	public Library saveLibrary(@RequestBody Library library) {
		
		return libraryService.saveLibrary(library);
	}
	
	@GetMapping("/{id}")
	public Library findLibraryById(@PathVariable("id") Long libId) {
		return libraryService.findLibaryById(libId);
	}

}
