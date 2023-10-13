package com.example.StudentLib.repositories;

import com.example.StudentLib.Modals.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<AuthorEntity,Integer> {
}
