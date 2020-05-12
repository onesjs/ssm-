package dpdd.service;

import dpdd.entity.Student;

import java.util.List;

/**
 * @author sjs
 * @date 2020/5/11 15:16
 */
public interface StudentService {
    List<Student> findAll();
    void insert(Student student);
    void update(Student student);
    void delete(int id);
}
