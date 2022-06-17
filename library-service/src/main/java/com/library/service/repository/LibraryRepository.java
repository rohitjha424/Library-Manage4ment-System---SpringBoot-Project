package com.library.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.service.entity.Library;
@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{

	Library findByLibraryId(Long libId);

}
