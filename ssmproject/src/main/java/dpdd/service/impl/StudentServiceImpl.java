package dpdd.service.impl;

import dpdd.dao.StudentDao;
import dpdd.entity.Student;
import dpdd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sjs
 * @date 2020/5/11 15:17
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentdao;
    @Override
    public List<Student> findAll() {
        return studentdao.findAll();
    }

    @Override
    public void insert(Student student) {
        studentdao.insert(student);
    }

    @Override
    public void update(Student student) {
        studentdao.update(student);
    }

    @Override
    public void delete(int id) {
        studentdao.delete(id);
    }
}
