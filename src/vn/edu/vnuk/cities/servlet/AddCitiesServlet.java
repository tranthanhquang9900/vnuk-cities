package vn.edu.vnuk.cities.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.edu.vnuk.cities.dao.CityDao;
import vn.edu.vnuk.cities.model.City;

@WebServlet("/addCities")
@SuppressWarnings("serial")
public class AddCitiesServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String city = request.getParameter("city");
		String province = request.getParameter("province");
		String zipCodeInStringFormat = request.getParameter("zip_code");
		
		Long zipcode = Long.parseLong(zipCodeInStringFormat);
		
		City contact = new City();
		contact.setCity(city);
		contact.setProvince(province);
		contact.setZip_code(zipcode);
		
		CityDao contactDao = new CityDao();
		try {
			contactDao.create(contact);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		out.println("<html>");
		out.println("<body>");
		out.println("contact " + contact.getCity() + " successfully added!");
		out.println("</body>");
		out.println("</html>");
	}
}