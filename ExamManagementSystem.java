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
public class ExamManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paper p1=new Paper("Java","CS103","Sir Ali Zaib","2nd","BS CS","Annual"," dept IIT room no 3 ",123,500,2,4,2020,8,30,0,false);
        
        Paper p2=new Paper("Discrete Math","CS203","sir Nouman","2nd","BS CS","Annual"," dept IIT room no 3",123,500,3,4,2020,8,30,0,false);
        
        Paper p3=new Paper("Eng","CS101","Sir Aksar","3rd","BS CS","Annual"," dept IIT room no 3",123,500,4,4,2020,8,30,0,false);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.println(p1.toString()+new Course("java","CS101","MCS"));
        System.out.println(p2.toString()+new Course("Math","CS102","MSC"));
        System.out.println(p3.toString()+new Course("English","CS201","BS CS"));
    }
    
}
