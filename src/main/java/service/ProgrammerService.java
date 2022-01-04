package service;

import dao.ProgrammerDao;
import model.Gender;
import model.Programmer;

public class ProgrammerService {
    ProgrammerDao programmerDao = new ProgrammerDao();

    public int saveUser(String name, String family, String gender) {
        Gender programmerGender;
        try {
            programmerGender = Gender.valueOf(gender);
        } catch (IllegalArgumentException e) {
            programmerGender = Gender.NOT_SET;
        }

        Programmer programmer = new Programmer(name, family, programmerGender);

        return programmerDao.save(programmer);
    }
}
