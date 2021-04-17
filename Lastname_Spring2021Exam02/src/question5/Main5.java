/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542000
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Raja","521 west 6th street","1234567890","nvta@gmail.com");
        Student student = new Student("A", "Naveen","603 east 7th street","5084406313","nvtan@gmail.com");
        Employee employee = new Employee("admin office",2590,"03-12-2019","Venkata","781 west street","9807654322","venkata@yahoo.com");
        Faculty faculty = new Faculty(4,2,"cs department",4500,"12-11-2018","Pradeep","1234 W st","213454321","raja@gmail.com");
        Staff staff = new Staff("Professor","Library Office",1090,"01-12-2015","Charles","no st for me","1234567890","charles@nomail.com");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
    
}
