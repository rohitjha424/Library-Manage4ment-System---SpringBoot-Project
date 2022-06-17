package com.library.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.service.entity.Library;
import com.library.service.repository.LibraryRepository;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepository libraryRepository;

	public Library saveLibrary(Library library) {
		// TODO Auto-generated method stub
		return libraryRepository.save(library);
	}

	public Library findLibaryById(Long libId) {
		// TODO Auto-generated method stub
		return libraryRepository.findByLibraryId(libId);
	}

}
