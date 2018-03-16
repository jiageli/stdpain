package xin.stdpain.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SecurityFilter extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("==>>Begin to Filter session====");
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("user");
		System.out.println("===??Current User==" + username);
		String curPath = request.getRequestURL().toString();
		System.out.println("===>> curpath:" + curPath);

		if (curPath.indexOf("service") < 0) {
			return true;
		}
		
		if (null == username || "".equals(username)) {
			System.out.println("usernull");
			/**
			 * handle session and security if you want.
			 */
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
			return false;
		}
		return super.preHandle(request, response, handler);
	}
}
