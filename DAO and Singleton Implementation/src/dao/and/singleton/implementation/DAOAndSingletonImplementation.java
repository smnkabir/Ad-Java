/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.and.singleton.implementation;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author nk
 */
public class DAOAndSingletonImplementation {

    public DAOAndSingletonImplementation() {
        Student student = null;
        /**
         * * Database Part **
         */
        StudentDAO daoObj = new StudentDAOMysql();

//        student = daoObj.create(new Student("2016000000096","Nazmul Kabir"));
//        System.out.println(student);
//        student = daoObj.retrieve("2016000000096");
//        System.out.println(student);
//        
//        List<Student> studentList = daoObj.retrieve();
//        studentList.stream().forEach(System.out :: println);
//        
//        student = daoObj.update("2016000000096",new Student("2016000000096","Nazmul Kabir"));
//        System.out.println(student);
//        System.out.println(daoObj.delete("2016000000091"));
        /**
         * * End **
         */
        /**
         * * File IO **
         */
        daoObj = new StudentDAOFileImplementation();

//        daoObj.create(new Student("2016000000096","Nazmul Kabir"));
//        student = daoObj.retrieve("2016000000096");
//        System.out.println(student);
//        daoObj.retrieve().stream().forEach(System.out::println);
        
        System.out.println(daoObj.delete("2016000000096"));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DAOAndSingletonImplementation();
    }

}
