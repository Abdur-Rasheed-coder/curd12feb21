package curd.example.curd12feb21.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import curd.example.curd12feb21.domain.Contact;

public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {

}
