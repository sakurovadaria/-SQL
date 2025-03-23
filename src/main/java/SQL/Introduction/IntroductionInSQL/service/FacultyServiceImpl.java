package SQL.Introduction.IntroductionInSQL.service;

import SQL.Introduction.IntroductionInSQL.exception.StudentNotFoundException;
import SQL.Introduction.IntroductionInSQL.model.Faculty;
import SQL.Introduction.IntroductionInSQL.repository.FacultyRepository;
import org.springframework.stereotype.Service;

@Service
public class FacultyServiceImpl implements FacultyService{


    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }


    @Override
    public Faculty getFaculty(Long id) {
        return facultyRepository.findById(id)
                .orElseThrow(()-> new StudentNotFoundException("Факультет не найден"));
    }

    @Override
    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public void removeFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
}
