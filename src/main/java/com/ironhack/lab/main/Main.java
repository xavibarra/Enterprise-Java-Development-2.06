package com.ironhack.lab.main;
import com.ironhack.lab.clases.Student;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Student> increaseGradesBy10Percent(Map<String, Student> map){
        double tenPercent = 0;
        for (String name: map.keySet()) {
            tenPercent =  (map.get(name).getGrade() * 0.1);
            map.get(name).setGrade((int) (map.get(name).getGrade() + tenPercent));
        }
        return map;
    }
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        Student xavi = new Student("Xavi", 50);
        Student juan = new Student("Juan", 30);
        Student pablo = new Student("Pablo", 60);
        Student ana = new Student("Ana", 70);

        studentMap.put(xavi.getName(), xavi);
        studentMap.put(juan.getName(), juan);
        studentMap.put(pablo.getName(), pablo);
        studentMap.put(ana.getName(), ana);

        increaseGradesBy10Percent(studentMap);

        System.out.println(studentMap);

    }


}