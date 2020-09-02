package com.best.student_manager.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.best.student_manager.Dao.StudentDao;
import com.best.student_manager.model.Grade;
import com.best.student_manager.model.Section;
import com.best.student_manager.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	final private StudentDao studentDao;
    public StudentServlet() {
    	  this.studentDao= new StudentDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("action")!=null) {
			String action=request.getParameter("action");
			if(action.equalsIgnoreCase("new")) {
				RequestDispatcher rd=request.getRequestDispatcher("new_section.jsp");
				request.setAttribute("grades",studentDao.getGradeList());
				rd.forward(request, response);
				
			}
			
			if(action.equalsIgnoreCase("new")) {
				RequestDispatcher rd=request.getRequestDispatcher("new_section.jsp");
				request.setAttribute("sections",studentDao.getSectionList());
				rd.forward(request, response);
				
			}
			else if(action.equalsIgnoreCase("save")) {
				String name=request.getParameter("stname");
				
				Integer grade_id=Integer.parseInt(request.getParameter("grade_id"));
				Integer section_id=Integer.parseInt(request.getParameter("section_id"));
		
				Student stu=new Student();
				stu.setName(name);
				Grade g=studentDao.getGradeById(grade_id);
				Section s=studentDao.getSectionById(section_id);
				sec.setGrade(g);
				
				studentDao.saveSection(sec);
				RequestDispatcher rd=request.getRequestDispatcher("new_section.jsp");
				request.setAttribute("sections",studentDao.getSectionList());
				rd.forward(request, response);
			}
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("section_list.jsp");
			request.setAttribute("sections",studentDao.getSectionList());
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
