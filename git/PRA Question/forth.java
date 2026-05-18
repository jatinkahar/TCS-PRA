import java.util.*;
class forth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Emp> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();
            list.add(new Emp(id, name, salary));
}
        double x = sc.nextDouble();
        servicec.help(list, x);
}
}
class servicec{
    public static void help(List<Emp> emps,double x){
        for(Emp e:emps){
            if(e.salary>x){
                System.out.println(e.name);
            }
        }
    }
    }
class Emp{
    int id;
    String name;
    double salary;
    public Emp(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}