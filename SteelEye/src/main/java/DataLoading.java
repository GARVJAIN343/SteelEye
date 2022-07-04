

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


/**
 * Servlet implementation class DataLoading
 */
@WebServlet("/DataLoading")
public class DataLoading extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataLoading() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HashMap<Object,Object> Response=new HashMap<Object,Object>();
		ArrayList<Trade> Traders=new ArrayList<Trade>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/steeleye","root","root123");
			PreparedStatement ps=con.prepareStatement("select * from trade");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				Trade trade=new Trade(rs.getString("Assest_class"),rs.getString("Counterparty"),rs.getString("Instrument_id"),rs.getString("Instrument_name"),rs.getString("Trade_date_time"),rs.getInt("trade_id"),
						 rs.getString("trader"),rs.getInt("Price"),rs.getInt("Quantity"));
						
						
				Traders.add(trade);
				
			}
			Response.put("Trade", Traders);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Gson gson=new Gson();
		String jsonResponse=gson.toJson(Response);
		response.setHeader("Access-Control-Allow-Origin","*");
		response.getWriter().append(jsonResponse);
		
		response.setHeader("Access-Control-Allow-Origin","*");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
