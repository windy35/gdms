package com.gdms.crud.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub		
		 //首先进入的方法
        //System.out.println("preHandle");
        //return false表示进行拦截，不向下执行
         //return true表示不进行拦截
        //System.out.println(request.getServletPath());
        HttpSession session = request.getSession();
        Object user = (Object)session.getAttribute("user");
        if(user != null){
            return true;
        }else{
        	request.getRequestDispatcher("/WEB-INF/views/none-login.jsp").forward(request, response);           	
            return false;
        }
	}

   //返回modelAndView之前执行	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
        //System.out.println("postHandle");
	}

    //执行Handler完成执行此方法
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
        //System.out.println("afterCompletion");
	}

}
