package com.statusprojectcontroller.statusprojectcontroller.repositories;

import com.statusprojectcontroller.statusprojectcontroller.models.project.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
