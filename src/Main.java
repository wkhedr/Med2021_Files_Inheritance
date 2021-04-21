import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("name1","name1@email.com", 22);
        p.ShowInfo();

        Student s = new Student("name2","name2@email.com", 33,3.5,123);
//        s.setName("name2");
//        s.setEmail("name2@email.com");
//        s.setAge(33);
        //s.ShowInfo();
        System.out.println(s);


        /*try {
            FileWriter file = new FileWriter("d:/data/f1.txt",true);
            PrintWriter output = new PrintWriter(file);
            output.println("hello");
            output.println("world");
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File inFile = new File("d:/data/f1.txt");
        Scanner input = null;
        try {
            input = new Scanner(inFile);
            String s = input.nextLine();
            input.close();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


        // write your code here
    }
}
