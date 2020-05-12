package dpdd.controller;
import dpdd.entity.Student;
import dpdd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * @author sjs
 * @date 2020/5/11 15:18
 */
@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private StudentService studentServiceImpl;

    /*查询所有*/
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Student> students = studentServiceImpl.findAll();
        model.addAttribute("all",students);
        return "list";
    }
    /*增删查三个方法的返回值，我都设为void，因为我使用了重定向到/stu/findAll，
    也就是查询所有findAll的方法。浏览器将会返回list.jsp页面，*/
    /*新增操作*/
    @RequestMapping("/add")
    public void add(Student student, HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*解决中文乱码*/
        String s = new String(student.getName().getBytes("ISO-8859-1"), "UTF-8");
        student.setName(s);
        studentServiceImpl.insert(student);
        response.sendRedirect(request.getContextPath()+"/stu/findAll");
    }

    /*删除操作*/
    @RequestMapping("/delete")
    public void delete(int id,HttpServletRequest request, HttpServletResponse response) throws IOException {
        studentServiceImpl.delete(id);
        response.sendRedirect(request.getContextPath()+"/stu/findAll");
    }

    /*修改操作*/
    @RequestMapping("/update")
    public void update(Student student, HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*解决中文乱码*/
        String s = new String(student.getName().getBytes("ISO-8859-1"), "UTF-8");
        student.setName(s);
        studentServiceImpl.update(student);
        response.sendRedirect(request.getContextPath()+"/stu/findAll");
    }



}
