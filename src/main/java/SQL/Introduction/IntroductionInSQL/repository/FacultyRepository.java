package SQL.Introduction.IntroductionInSQL.repository;

import SQL.Introduction.IntroductionInSQL.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    List<Faculty> findByColorIgnoreCaseOrNameIgnoreCase(String color, String name);
}
