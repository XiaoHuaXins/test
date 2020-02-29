package com.company;

import com.company.entity.Person;
import com.company.service.personService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/company/applicationContent.xml");
        //获取bean
        personService  PersonService = (personService)context.getBean("personService");

        Person person = new Person();

        PersonService.addStudent(person);
    }
}
