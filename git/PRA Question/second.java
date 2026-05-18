public class second{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine().trim());
        List<Student> std = new ArrayList<>();
        for(int i=0;i<n;i++){
                int sid=Integer.parseInt(sc.nextLine().trim());
    string sname=sc.nextLine().trim();
    int count=Integer.parseInt(sc.nextLine().trim());
    List<Course> courses = new ArrayList<>();
    for(int j=0;j<count;j++){
        int cid=Integer.parseInt(sc.nextLine().trim());
    String cname=sc.nextLine().trim();
    double cFee=Double.parseDouble(sc.nextLine().trim());
    courses.add(new Course(cid,cname,cFee));

        }
        std.add(new Student(sid,sname,count,courses));
    }
    String fname=sc.nextLine().trim();
    double average = findAverageCourseFeeByStudent(std,fname);
    System.out.println(average);
}
public static double findAverageCourseFeeByStudent(List<Student> std, String fname){
    double sum=0;
    int count=0;

for(Student x:std){
        if(x.cname.equalsIgnoreCase(fname)){
                for(Course c:x.courses){

            sum+=c.cFee;
            count++;
        }
}
}
return sum/count;
}
}
class Student{
    int sid;
    string sname;
    int count;
    List<Course> courses;
    public Student(int sid, string sname,int count, List<Course> courses){
        this.sid = sid;
        this.sname = sname;
        this.courses = courses;
}
}
class Course{
    int cid;
    String cname;
    double cFee;
    public Course(int cid, String cname, double cFee){
        this.cid = cid;
        this.cname = cname;
        this.cFee = cFee;
    }
}