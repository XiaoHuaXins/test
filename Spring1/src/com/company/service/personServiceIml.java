package com.company.service;


import com.company.dao.personDao;
import com.company.entity.Person;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class personServiceIml implements personService {
    personDao PersonDao;

    public void setPersonDao(personDao personDao) {
        PersonDao = personDao;
    }

    @Transactional(readOnly = false,propagation = Propagation.REQUIRED)
    //要么全成功、要么全失败
    @Override
    public void addStudent(Person person) {
            //判断学生是否存在
        PersonDao.addStudent(person);
    }
}
