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
public class Student {

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address,String rollNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNumber = rollNumber;
    }
    //Phạm vi truy cập : public,private,protected
    private String name;
    private int age;
    private String address;
    private String phone;
    private String rollNumber;

    //getter và setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return "Mã của sinh viên : " + this.rollNumber
                + ", tên của sinh viên là : " + this.name
                + "," + this.age + " tuổi ," + "sống ở " + this.address
                + ", số điện thoại " + this.phone;
    }
}
