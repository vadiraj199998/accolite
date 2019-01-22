package com.springdemo.tutorial;

import org.springframework.stereotype.Component;

@Component("jdbcTemplateDao")
public class JDBCTemplateDao {
	
/*	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveStudent(Student student){
		String query = "insert into Student(STUDENT_ID,STUDENT_NAME) values "
				+ "("+student.getStudentId()+",'"+student.getStudentName()+"')";
		return jdbcTemplate.update(query);
	}
	
	//Prepared Statement
		public Boolean saveStudentUsingPreparedStatement(final Student student){
			String query = "insert into Student(STUDENT_ID,STUDENT_NAME) values (?,?)";
			return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {

				public Boolean doInPreparedStatement(PreparedStatement ps)
						throws SQLException, DataAccessException {
					ps.setInt(1, student.getStudentId());
					ps.setString(2, student.getStudentName());
					return ps.execute();
				}
			});
		}*/
	
	

}
