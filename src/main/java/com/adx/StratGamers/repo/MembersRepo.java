package com.adx.StratGamers.repo;

import com.adx.StratGamers.model.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MembersRepo extends JpaRepository<Members, Long> {
}
