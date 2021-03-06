package com.spring.agendalive.repository;

import com.spring.agendalive.model.LiveDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;


public interface LiveRepository extends CrudRepository<LiveDocument, String> {

    Page<LiveDocument> findByLiveDateAfterOrderByLiveDateAsc(LocalDateTime date, Pageable pageable);
    Page<LiveDocument> findByLiveDateBeforeOrderByLiveDateDesc(LocalDateTime date, Pageable pageable);

    Page<LiveDocument> findAll(Pageable pageable);
}
