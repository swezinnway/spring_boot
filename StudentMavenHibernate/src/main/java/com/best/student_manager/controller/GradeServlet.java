package com.best.student_manager.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.best.student_manager.Dao.StudentDao;
import com.best.student_manager.model.Grade;




public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	final private StudentDao studentDao;
	
    public GradeServlet() {
  
        this.studentDao= new StudentDao();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("action")!=null) {
			if(request.getParameter("action").equalsIgnoreCase("save")) {
				Grade grade=new Grade();
				grade.setName(request.getParameter("gname"));
				studentDao.saveGrade(grade);
				List<Grade> gList=studentDao.getGradeList();
				RequestDispatcher rd=request.getRequestDispatcher("grade_list.jsp");
				request.setAttribute("grades", gList);
				
				rd.forward(request, response);
				
			}else if(request.getParameter("action").equalsIgnoreCase("new")){
				RequestDispatcher rd=request.getRequestDispatcher("new_grade.jsp");
				rd.forward(request, response);
			}
		}
		else {
			List<Grade> gList=studentDao.getGradeList();
			RequestDispatcher rd=request.getRequestDispatcher("grade_list.jsp");
			request.setAttribute("grades", gList);
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
