package com.adx.StratGamers.repo;

import com.adx.StratGamers.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NewsRepo extends JpaRepository<News, Long> {
}
