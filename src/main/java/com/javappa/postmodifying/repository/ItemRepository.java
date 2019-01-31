package com.javappa.postmodifying.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.javappa.postmodifying.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

	@Transactional
	@Modifying
	@Query("DELETE FROM Item i WHERE i.name LIKE :prefix%")
	void deleteByPrefix(@Param("prefix") String prefix);
}
