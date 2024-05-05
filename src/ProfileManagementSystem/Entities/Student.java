/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProfileManagementSystem.Entities;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student {

    public final int id;
    public final String first_name;
    public final String last_name;
    public final String middle_name;
    public final int age;
    public final String strand;
    public final int level;
    public final int section;
    public final Date birthday;
    public final String school_id;

    public Student(
            int id,
            String first_name,
            String last_name,
            String middle_name,
            int age,
            String strand,
            int level,
            int section,
            Date birthday,
            String school_id
    ) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.age = age;
        this.strand = strand;
        this.level = level;
        this.section = section;
        this.birthday = birthday;
        this.school_id = school_id;
        
    }
    
    public static Student fromResultSet(ResultSet rs) throws SQLException {
        return new Student(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("middle_name"),
                rs.getInt("age"),
                rs.getString("strand"),
                rs.getInt("level"),
                rs.getInt("section"),
                rs.getDate("birthday"),
                rs.getString("school_id")
        );
    }
}
