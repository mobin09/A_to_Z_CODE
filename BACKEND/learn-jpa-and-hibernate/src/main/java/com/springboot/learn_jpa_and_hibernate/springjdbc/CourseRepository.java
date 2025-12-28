package com.springboot.learn_jpa_and_hibernate.springjdbc;

import com.springboot.learn_jpa_and_hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
   @Autowired
   private JdbcTemplate jdbcTemplate;

   public void insertCourse(){
       String query = """
                INSERT INTO course(author, name)
                values(?,?);
              """;
       jdbcTemplate.update(query, "Amazon", "Learn for Certified AWS Solution Architect");
   }

   public Course getCourse(int id){
       String query = """
               SELECT * FROM course where id = ?;
               """;
      return jdbcTemplate.queryForObject(query,
               new Object[]{id},
               (rs, rownu) ->
                       new Course(rs.getString("author"), rs.getString("name"))
               );
   }

}
