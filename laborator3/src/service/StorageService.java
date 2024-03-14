package service;
import model.Student;
import model.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StorageService {
    private List<Student> students;
    private List<Professor> professors;

    private String operation;

    private void create(){
        System.out.println("Enter type of person");
        Scanner scanner = new Scanner(System.in);
        String persoana = scanner.nextLine().toLowerCase();
        if(persoana.equals("student")){
            System.out.println("name: ");
            String name = scanner.nextLine();
            System.out.println("phone number: ");
            String phn = scanner.nextLine();
            System.out.println("email");
            String email = scanner.nextLine();
            System.out.println("student number:");
            Integer snum = scanner.nextInt();
            System.out.println("average mark: ");
            Double avg = scanner.nextDouble();
            System.out.println("class: ");
            Integer classs = scanner.nextInt();

            Student student = new Student(name, phn, email, snum, avg, classs);
            students.add(student);
        }
        else if(persoana.equals("professor")){
            System.out.println("name: ");
            String name = scanner.nextLine();
            System.out.println("phone number: ");
            String phn = scanner.nextLine();
            System.out.println("email");
            String email = scanner.nextLine();
            System.out.println("course");
            String course = scanner.nextLine();
            System.out.println("year");
            Integer year = scanner.nextInt();

            Professor professor = new Professor(name,phn,email,course,year);
            professors.add(professor);
        }
        else{
            System.out.println("Unknown command");
        }
    }

    private void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = scanner.nextLine();
        boolean found = false;
       for(Student stu: students){
           if(stu.getName().equals(name)){
                System.out.println(stu.getName());
                System.out.println(stu.getPhone_number());
                System.out.println(stu.getEmail());
               System.out.println(stu.getStudent_number());
               System.out.println(stu.getAvg_mark());
               System.out.println(stu.getClasss());
                found = true;
           }
       }
         for(Professor prof: professors){
              if(prof.getName().equals(name)){
                System.out.println(prof.getName());
                System.out.println(prof.getPhone_number());
                System.out.println(prof.getEmail());
                System.out.println(prof.getCourse());
                System.out.println(prof.getYear());
                found = true;
              }
         }
            if(!found){
                System.out.println("Person not found");
            }
    }

    private void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = scanner.nextLine();
        boolean found = false;
        for(Student stu: students){
            if(stu.getName().equals(name)){
                System.out.println("phone number: ");
                String phn = scanner.nextLine();
                System.out.println("email");
                String email = scanner.nextLine();
                System.out.println("student number:");
                Integer snum = scanner.nextInt();
                System.out.println("average mark: ");
                Double avg = scanner.nextDouble();
                System.out.println("class: ");
                Integer classs = scanner.nextInt();
                stu.setPhone_number(phn);
                stu.setEmail(email);
                stu.setStudent_number(snum);
                stu.setAvg_mark(avg);
                stu.setClasss(classs);
                found = true;
            }
        }
        for(Professor prof: professors){
            if(prof.getName().equals(name)){
                System.out.println("phone number: ");
                String phn = scanner.nextLine();
                System.out.println("email");
                String email = scanner.nextLine();
                System.out.println("course");
                String course = scanner.nextLine();
                System.out.println("year");
                Integer year = scanner.nextInt();
                prof.setPhone_number(phn);
                prof.setEmail(email);
                prof.setCourse(course);
                prof.setYear(year);
                found = true;
            }
        }
        if(!found){
            System.out.println("Person not found");
        }
    }

    private void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                System.out.println("Student removed");
                found = true;
                break;
            }
        }
        for(int i = 0; i < professors.size(); i++){
            if(professors.get(i).getName().equals(name)){
                professors.remove(i);
                System.out.println("Professor removed");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Person not found");
        }
    }
    public StorageService(){
        students = new ArrayList<>();
        professors = new ArrayList<>();
    }
    public void execute(String s){



        operation = s;
        if(operation.equals("create")){
            System.out.println("Command received: Create");
            create();

        }
        else if(operation.equals("read")){
            System.out.println("Command received: read");
            read();
        }
        else if(operation.equals("update")){
            System.out.println("Command received: update");
            update();
        }
        else if(operation.equals("delete")){
            System.out.println("Command received: delete");
            delete();
        }
        else{
            System.out.println("Unknown command");
        }
    }

}