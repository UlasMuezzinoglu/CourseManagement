package com.company;

public class CourseManager {
    public void AddCourse(Course course){
        System.out.println(course.getInstructer().getName()+" adlı Eğitmene ait, "+course.getName()+" Kursu Eklendi");
    }
    public void DeleteCourse(Course course){
        System.out.println(course.getInstructer()+" adlı Eğitmene ait, "+course.getName()+" Kursu Silindi");
    }
    public void GetAllCourses(Course[] courses){
        for (Course course : courses){
            System.out.println(course);
        }
    }
    public void multiAdd(Course[] courses){
        for (Course course : courses){
            AddCourse(course);
        }
    }
}
