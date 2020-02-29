package Servlet;

import Dao.LoninDao;
import Service.AddService;
import entity.Lonin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Servlet", urlPatterns="/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //注册请求
       try {
           if(""==request.getParameter("uname")){
               response.sendRedirect("register.jsp");
           }
           else if(request.getParameter("rename")!=""){
               AddService addService = new AddService();
               String id = request.getParameter("id");
               String pwd = request.getParameter("pwd");
               String name = request.getParameter("rename");
               Lonin lonin = new Lonin(name,id,pwd);
               if(addService.add(lonin)){
                   response.sendRedirect("welcome.jsp");
               }
               else {
                   response.sendRedirect("false.jsp");
               }
           }

           else {//登陆请求
               String id = request.getParameter("uname");
               String pwd = request.getParameter("upwd");
               Lonin lonin = new Lonin(id,pwd);
               LoninDao loninDao =  new  LoninDao();
               boolean rs = loninDao.login(lonin);


               if(rs){
                   response.sendRedirect("show.jsp");//登陆成功
               }
               else{
                   response.sendRedirect("react.jsp" );//登陆失败
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

}
}
