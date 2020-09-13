package src.main.java.com.best.bright.train_manager.services;

import java.util.List;

import src.main.java.com.best.bright.train_manager.dto.StudentInfo;
import src.main.java.com.best.bright.train_manager.dto.StudentRegisterDTO;


public interface StudentManagerInterface {

	void saveStudent(StudentRegisterDTO stdDTO);
	List<StudentRegisterDTO> getAllStudentList();
	List<StudentInfo> getStudentInfo();
}
