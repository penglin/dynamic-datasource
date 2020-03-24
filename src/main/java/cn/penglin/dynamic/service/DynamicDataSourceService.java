package cn.penglin.dynamic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.penglin.dynamic.dao.StudentMapper;
import cn.penglin.dynamic.dao.TeacherMapper;
import cn.penglin.dynamic.dao.UserMapper;
import cn.penglin.dynamic.datasource.TargetDataSource;
import cn.penglin.dynamic.model.Student;
import cn.penglin.dynamic.model.Teacher;
import cn.penglin.dynamic.model.User;

@Service
public class DynamicDataSourceService {
	@Autowired
    private UserMapper userMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private StudentMapper studentMapper;
 
    //不指定数据源使用默认数据源
    public User getUserData(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
 
    //指定数据源-ds1
    @TargetDataSource(name="ds1")
    public Teacher getTeacherData(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }
 
    //指定数据源-ds2
    @TargetDataSource(name="ds2")
    public Student getStudentData(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
