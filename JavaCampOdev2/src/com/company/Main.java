package com.company;

public class Main {

    public static void main(String[] args) {

       Instructer ulas = new Instructer();
       ulas.setId(1);
       ulas.setName("Ulaş Müezzinoğlu");
       ulas.setBio("21 years old");

        Instructer engin = new Instructer();
        engin.setId(2);
        engin.setName("Engin Demiroğ");
        engin.setBio("MCT ,PMP ve ITIL sertifikalarına sahibim.");

        Course cSharpKursu = new Course();
        cSharpKursu.setId(1);
        cSharpKursu.setName("C# ve React Öğreniyoruz !");
        cSharpKursu.setInstructer(ulas);

        Course javaKursu = new Course();
        javaKursu.setId(2);
        javaKursu.setName("Java ve Angular Öğreniyoruz !");
        javaKursu.setInstructer(engin);

        Course[] courses = { javaKursu,cSharpKursu};
        CourseManager courseManager = new CourseManager();
       // courseManager.multiAdd(courses);
        courseManager.AddCourse(javaKursu);
        courseManager.AddCourse(cSharpKursu);

        InstructerManager instructerManager = new InstructerManager();
        instructerManager.getBio(engin);
    }
}
