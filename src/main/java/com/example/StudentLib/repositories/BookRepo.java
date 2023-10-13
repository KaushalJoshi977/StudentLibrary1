package com.example.StudentLib.repositories;

import com.example.StudentLib.Modals.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookEntity,Integer> {
}
