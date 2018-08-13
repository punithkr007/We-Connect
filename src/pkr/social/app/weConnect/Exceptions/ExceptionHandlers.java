package pkr.social.app.weConnect.Exceptions;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlers.class);

	@ExceptionHandler(SQLException.class)
	public String _handleSQLException(HttpServletRequest request, Exception ex) {
		logger.info("SQLException Occured:: URL=" + request.getRequestURL());
		return "wc.Sql.Exception";
	}

	@ExceptionHandler(IllegalStateException.class)
	public String _handleIllegalStateException(HttpServletRequest request, Exception ex) {
		logger.info("SQLException Occured:: URL=" + request.getRequestURL());
		return "wc.Sql.Exception";
	}

	@ExceptionHandler(IOException.class)
	public String _handleIOException(HttpServletRequest request, Exception ex) {
		logger.info("SQLException Occured:: URL=" + request.getRequestURL());
		return "wc.Sql.Exception";
	}

	@ExceptionHandler(Exception.class)
	public String _handleException(HttpServletRequest request, Exception ex) {
		logger.info("SQLException Occured:: URL=" + request.getRequestURL());
		return "wc.Sql.Exception";
	}

}
