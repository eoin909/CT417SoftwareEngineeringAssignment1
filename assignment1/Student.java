public class Student {

private String name;
private String DOB;
private String userName;
private String studentId;
private int age;

private static int ID = 0;

  Student(String studentName, String dob){

  age = calAge(dob);
  name = studentName;
  userName = name + age;
  studentId = ID;
  ID++;
  }

  String getUserName(){
    return userName;
  }
}
