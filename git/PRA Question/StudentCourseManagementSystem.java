        import java.util.*;
        class StudentCourseManagementSystem{
            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                List<Student> std=new ArrayList<>();
                for(int i=0;i<n;i++){
            int sid=sc.nextInt();
            String sname=sc.next();
            int count=sc.nextInt();
            List<Course> courses=new ArrayList<>();
            for(int j=0;j<count;j++){
                int cid=sc.nextInt();
            String cname=sc.next();
            double fee=sc.nextDouble();
            courses.add(new Course(cid,cname,fee));
            }
            std.add(new Student(sid,sname,count,courses));
                }
                            String res=Service.help(std);
            if(res.isEmpty()){
                System.out.println("No students found");
            }
            else{
                System.out.println(res);
            }
            }

        }
        class Service{
            public static String help(List<Student> std){
                String maxfee=null;
                double max=0;
for(Student s:std){
                double sum=0;
    for(Course c:s.courses){
        sum+=c.fee;
    }
    if(sum>max){
    max=sum;
    maxfee=s.sname;
}
}


            return maxfee;
        }}

        class Course{
            int cid;
            String cname;
            double fee;
            public Course(int cid, String cname, double fee){
                this.cid = cid;
                this.cname = cname;
                this.fee = fee;
        }}
        class Student{
            int sid;
            String sname;
            int count;
            List<Course> courses;
            public Student(int sid, String sname,int count,List<Course> courses){
                this.sid = sid;
                this.sname = sname;
                this.courses = courses;
            }
        }
