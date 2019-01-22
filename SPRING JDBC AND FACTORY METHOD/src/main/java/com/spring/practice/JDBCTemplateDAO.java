package com.spring.practice;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import org.springframework.jdbc.core.RowMapper;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

@Component
public class JDBCTemplateDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setTemplate(JdbcTemplate template) {  
	    this.jdbcTemplate = template;  
	}  
	  
	public List<Attendance> getAllEmployeesRowMapper(){  
		 return jdbcTemplate.query("select * from Attendence",new RowMapper<Attendance>(){  
			 
			 public Attendance mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Attendance e=new Attendance();  
		        e.setSid(rs.getInt(1));
		        e.setName(rs.getString(2));  
		        e.setStatus(rs.getString(3));
		        return e;  
		    }  
		 }); 
	}
	
	public int saveAttendance(Attendance attendance) {
		
		String query="insert into Attendence values ("+attendance.getSid()+",'"+attendance.getName()+"','"+attendance.getStatus()+"')";
		return jdbcTemplate.update(query);
		
	}
	
	//public Boolean saveStudentUsingPreparedStatement(final Attendance at){
	//	String query = "insert into attendance(SID,NAME,STATUS) values (?,?,?)";
	//	return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

	//		public Boolean doInPreparedStatement(PreparedStatement ps)
		//			throws SQLException, DataAccessException {
	//			ps.setLong(1, at.getSid());
	//			ps.setString(2, at.getName());
	//			ps.setString(3, at.getStatus());
	//			return ps.execute();
	//		}
	//	});
	//}
	

}
