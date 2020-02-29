import Mapper.Person;
import Mapper.personMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {


        Reader reader = Resources.getResourceAsReader("config.xml");

        Person person = new Person("Man");

        person.setUsername("肖华鑫");

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session = sessionFactory.openSession();

        //增加
       personMapper mapper = session.getMapper(personMapper.class) ;

       List<Person> list = mapper.selectByNaOrAge(person);

        System.out.println(list);

        session.close();
    }
}
