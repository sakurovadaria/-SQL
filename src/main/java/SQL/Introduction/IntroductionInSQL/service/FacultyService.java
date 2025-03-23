package SQL.Introduction.IntroductionInSQL.service;

import SQL.Introduction.IntroductionInSQL.model.Faculty;

public interface FacultyService {
    Faculty getFaculty(Long id);

    Faculty createFaculty(Faculty faculty);

    Faculty updateFaculty(Faculty faculty);

    void removeFaculty(Long id);
}
