package Mapper;

import java.util.List;

public interface personMapper {

     void insertInfo(Person person);
     List<Person> selectAll();
    List<Person> selectByNaOrAge(Person person);
     void deleteAll();
}
