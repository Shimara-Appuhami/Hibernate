package lk.ijse.gdse;

import lk.ijse.gdse.config.FactoryConfiguration;
import lk.ijse.gdse.embeded.FullName;
import lk.ijse.gdse.entity.Batch;
import lk.ijse.gdse.entity.Student;
import lk.ijse.gdse.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

class Main {
    public static void main(String[] args) {
        Session session =FactoryConfiguration.getInstance().getSession();
        Student student=new Student();
//        FullName fullName=new FullName("Kamal","Perera");
//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("Kandy");
//        Transaction transaction=session.beginTransaction();

//        session.save(student);
        // session.update(student);
        // session.delete(student);

//        session.get(Student.class,1);
//        System.out.println("ID: " + student.getId());
//        System.out.println("Name: " + student.getName());
//        System.out.println("Address: " + student.getAddress());

        Batch batch=new Batch();
//        batch.setBatch_no(69);
//        batch.setCourse_name("GDSE");
//        batch.setSemester(3);
//        session.save(batch);
//        session.update(batch);
//        session.delete(batch);
//        session.get(Batch.class,69);
//        System.out.println("Batch No: " + batch.getBatch_no());
//        System.out.println("Course Name: " + batch.getCourse_name());
//        System.out.println("Semester: " + batch.getSemester());

        Teacher teacher=new Teacher();
        FullName fullName=new FullName("Kamal","Perera");

        teacher.setT_id("t_1");
        teacher.setName(fullName);
        teacher.setExperience("2 Years");
        Transaction transaction=session.beginTransaction();
//        session.save(teacher);
//          session.update(teacher);
//          session.delete(teacher);
          session.get(Teacher.class,"t_1");
          System.out.println("ID: " + teacher.getT_id());
          System.out.println("Name: " + teacher.getName());
          System.out.println("Experience: " + teacher.getExperience());



        transaction.commit();
        session.close();



    }
}