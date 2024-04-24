package org.example;

import org.example.db.dao.PersonDao;
import org.example.entity.Person;

public class PersonService {
    private PersonDao personDao = new PersonDao();

    public void savePerson(Person person) {
        personDao.save(person);
    }

    public Person findPersonById(Long id) {
        return personDao.findById(id);
    }

    public void updatePerson(Person person) {
        personDao.update(person);
    }

    public void deletePerson(Person person) {
        personDao.delete(person);
    }
}

