/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exammanagementsystem;

/**
 *
 * @author MOON COMP&MOBILE
 */
public class Course {
    private final String CourseName;
    private String CourseCode,ProgramName;

    public Course(String CourseName, String CourseCode, String ProgramName) {
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
        this.ProgramName = ProgramName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getProgramName() {
        return ProgramName;
    }

    public void setProgramName(String ProgramName) {
        this.ProgramName = ProgramName;
    }

    @Override
    public String toString() {
        return "Course{" + "Course's Name=" + CourseName + ", Course's Code=" + CourseCode + ", Program's Name=" + ProgramName + '}';
    }
    
}
