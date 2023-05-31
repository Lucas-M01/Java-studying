package application;

import java.util.Scanner;
import java.util.Set;

import entities.Courses;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Courses> courses = new HashSet<>();

        System.out.print("How many students for course A?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            courses.add(new Courses(sc.nextInt()));
        }

        System.out.print("How many students for course B?");
        n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            courses.add(new Courses(sc.nextInt()));
        }

        System.out.print("How many students for course C?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            courses.add(new Courses(sc.nextInt()));
        }

        System.out.println("Total students: " + courses.size());

        sc.close();
    }
}