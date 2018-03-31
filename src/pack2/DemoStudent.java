/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;

/**
 *
 * @author GIANG TINH
 */
public class DemoStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Tình");
        Student student2 = new Student("Tình", 18);
        Student student3 = new Student("Tình", 18, "Hà Nội","09898");
        System.out.println(student3.toString());
        System.out.println(student1.getName());
        System.out.println(student2.getAge());
        
//        student.setName("Tình");
//        student.setAge(18);
//        student.setAddress("Há Nội");
//        student.setPhone("12345677");
//        student.setRollNumber("00580");
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        System.out.println(student.getAddress());
//        System.out.println(student.getPhone());
//        System.out.println(student.getRollNumber());
//        
    }
}
