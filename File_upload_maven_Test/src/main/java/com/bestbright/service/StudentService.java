package com.bestbright.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.bestbright.dao.StudentDao;
import com.bestbright.dto.StudentDTO;
import com.bestbright.model.Student;




public class StudentService {

	@Autowired
	ServletContext serveletContext;
	@Autowired
	StudentDao studentDao;

	
	public String UPLOAD_DIRECTORY="/images/";
	
	
public void saveStudent(StudentDTO std){
		
		//ServletContext context = session.getServletContext();  
	    if(std!=null){
	    	String path = serveletContext.getRealPath(UPLOAD_DIRECTORY);   
	        String filename=std.getFile().getOriginalFilename();  
	          
	        System.out.println(path+" "+filename);  
	        try{  
	            byte[] bytes = std.getFile().getBytes();  
	            BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
	                 new File(path +"/"+ filename)));  
	            stream.write(bytes);  
	            stream.flush();  
	            stream.close();  
	          
	        }catch(Exception e){System.out.println(e);}
	        Student st=new Student(0L,std.getName(),std.getRollNo(),std.getEmail(),std.getAddress(),std.getGender(),std.getPhoneNo(),filename,std.getAge());
	        studentDao.saveStudent(st);
	    }
		
	    
	}
public List<Student> getStudentList(){
	return studentDao.getStudentList();
}
}
