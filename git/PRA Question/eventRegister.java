import java.util.*;
class Course{
int cid;
String cname;
double fee;
public Course(int cid,String cname,double fee){
    this.cid=cid;
    this.cname=cname;
    this.fee=fee;
}
}
class Student{
int sid;
String sname;
int numberOfCourses;
List<Course> courses;
public Student(int sid,
String sname,
int numberOfCourses,
List<Course> courses){
    this.sid=sid;
    this.sname=sname;
    this.numberOfCourses=numberOfCourses;
    this.courses=courses;
}
}
class InvalidFeeException extends Exception{
    public InvalidFeeException(String s){
        super(s);
    }
}
class DuplicateCourseException extends Exception{
    public DuplicateCourseException(String s){
        super(s);
    }
}
class Services{
    public static String findStudentWithHighestFee(
List<Student> student)
throws InvalidFeeException{

    double max=-1;
    String ans=null;

    for(Student s:student){

        double sum=0;

        for(Course c:s.courses){

            if(c.fee<0){

                throw new InvalidFeeException(
                "fees is negative");
            }

            sum+=c.fee;
        }

        if(sum>max){

            max=sum;
            ans=s.sname;
        }
    }

    return ans;
}

public static void registerCourse(
List<Student> student,
int nsid,
int ncid,
String ncname,
double nfee)throws DuplicateCourseException,InvalidFeeException{
    if(nfee<0){
                    throw new InvalidFeeException("fees is negative");
                }

    for(Student s:student){
        if(s.sid==nsid){
            
            for(Course c:s.courses){
                if(c.cid==ncid){
                    throw new DuplicateCourseException("Duplicate Course");
                }
                
            }
            s.courses.add(
new Course(
ncid,
ncname,
nfee
)
);
            System.out.println("course added successfully");
        }
    }
}
}
class eventRegister{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Student> student=new ArrayList<>();
        for(int i=0;i<n;i++){
                int sid=sc.nextInt();
String sname=sc.next();
                int numberOfCourses=sc.nextInt();
        List<Course> courses=new ArrayList<>();
        for(int j=0;j<numberOfCourses;j++){
            int cid =sc.nextInt();
            String cname=sc.next();
            double fee=sc.nextDouble();
            courses.add(new Course(cid,cname,fee));
        }
            student.add(new Student(sid,sname,numberOfCourses,courses));
        }
try{
    String res=
    Services.findStudentWithHighestFee(student);

    System.out.println(res);
}
catch(Exception e){
    System.out.println(e.getMessage());
}
        
            int nsid=sc.nextInt();
            int ncid=sc.nextInt();
            String ncname=sc.next();

            double nfee=sc.nextDouble();
            try{
                Services.registerCourse(student,nsid,ncid,ncname,nfee);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        
    }
}