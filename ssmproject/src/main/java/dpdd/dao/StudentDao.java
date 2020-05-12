package dpdd.dao;

import dpdd.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sjs
 * @date 2020/5/11 15:17
 */
@Repository
public interface StudentDao {
    @Select("select * from student")
    List<Student> findAll();

    @Insert("insert into student (name,password) values(#{name},#{password})")
    void insert(Student student);

    @Update("update student set name=#{name},password=#{password} where id=#{id}")
    void update(Student student);

    @Delete("delete from student where id=#{id}")
    void delete(int id);


}
