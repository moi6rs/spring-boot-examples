package com.ideasconnections.datarestexample.models.repository;

import com.ideasconnections.datarestexample.models.entity.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource(path = "person", collectionResourceRel = "person")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {

    List<Person> findByLastName(@Param("lastName") String lastName, Pageable pageable);
}
