package cn.penglin.dynamic.controlloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.penglin.dynamic.model.Student;
import cn.penglin.dynamic.model.Teacher;
import cn.penglin.dynamic.model.User;
import cn.penglin.dynamic.service.DynamicDataSourceService;

@RestController
@RequestMapping(value = "/dds")
public class DynamicDataSourceController {
	@Autowired
	private DynamicDataSourceService service;

	@RequestMapping(value = "/user/{id}")
	public User getAllUserData(@PathVariable String id) {
		return service.getUserData(id);
	}

	@RequestMapping(value = "/teacher/{id}")
	public Teacher getAllTeacherData(@PathVariable Integer id) {
		return service.getTeacherData(id);
	}

	@RequestMapping(value = "/student/{id}")
	public Student getAllStudentData(@PathVariable Integer id) {
		return service.getStudentData(id);
	}
}
