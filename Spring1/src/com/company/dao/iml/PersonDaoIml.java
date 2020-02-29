package com.company.dao.iml;

import com.company.dao.personDao;
import com.company.entity.Person;

public class PersonDaoIml implements personDao {
    @Override
    public void addStudent(Person person) {
        System.out.println("增加学生");
    }
}
