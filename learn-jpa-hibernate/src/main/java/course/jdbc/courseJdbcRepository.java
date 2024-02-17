package course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springBoot.learnjpahibernate.course.Course;


//@Repository refers to the class that talks to database

@Repository   
public class courseJdbcRepository {
	@Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY = "INSERT INTO COURSE "
    		+ "(ID, NAME,  COURSE)  VALUES(?, ?, ?)";
    private static String DELETE_QUERY = "DELETE FROM COURSE where id = ?";
    
    private static String GET_DATA = "SELECT * FROM COURSE where id = ?";
    
    public void insert(Course course) {
    	System.out.println("Data is inserted to DB");
    	jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getCourse());
    }
    
    public void delete(long id) {
    	System.out.println("Entry Deleted");
    	jdbcTemplate.update(DELETE_QUERY, id);
    }
    
    public Course getRecordsById(long id) {
    	// ResultSet --> Bean of Course
    	// 2nd arguments is passed as Row Mapper
    	 return jdbcTemplate.queryForObject(GET_DATA, new BeanPropertyRowMapper<>(Course.class), id);
    }
    
    
}
