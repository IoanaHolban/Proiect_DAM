package dam.tam4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dam.tam4.domain.Login;
import dam.tam4.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>  {

}
