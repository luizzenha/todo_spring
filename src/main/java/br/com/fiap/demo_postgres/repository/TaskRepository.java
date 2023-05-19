package br.com.fiap.demo_postgres.repository;

import br.com.fiap.demo_postgres.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
