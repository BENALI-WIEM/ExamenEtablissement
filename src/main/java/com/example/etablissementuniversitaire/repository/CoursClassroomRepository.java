package com.example.etablissementuniversitaire.repository;

import com.example.etablissementuniversitaire.entity.CoursClassroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursClassroomRepository extends JpaRepository<CoursClassroom, Integer> {

    @Modifying
    @Query("update CoursClassroom c set c.archive = TRUE")
    void archive();
}
