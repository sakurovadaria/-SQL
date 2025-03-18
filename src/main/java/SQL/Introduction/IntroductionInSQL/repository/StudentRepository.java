package SQL.Introduction.IntroductionInSQL.repository;

import SQL.Introduction.IntroductionInSQL.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByAgeBetween(Integer min, Integer max);
}
