package org.fjala.resoft.repositories;

import org.fjala.resoft.datatypes.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {
    Program findByName(String name);
}
