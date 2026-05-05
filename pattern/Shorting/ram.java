import java.util.*;

class school{
    private int id;
    private int rnum;
    private String name;
    private int age;

    public school(int id,int rnum,String name, int age){
        this.id=id;
        this.rnum=rnum;
        this.name=name;
        this.age=age;
    }
    public int getid(){return id;}
    public int getrnum(){return rnum;}
    public String getname(){return name;}
    public int getage(){return rnum;}
}

public class ram{
public static void main(String[] args){
    Scanner sr=new Scanner(System.in);
    List<school> stud=new ArrayList<>();
    for(int i=0;i<5;i++){
      int  id=Integer.parseInt(sr.nextLine().trim());
        int rnum=Integer.parseInt(sr.nextLine().trim());
        String name=sr.nextLine();
        int age=Integer.parseInt(sr.nextLine().trim());
    
        stud.add(new school(id,rnum,name,age));
    }
    System.out.print(stud);
    
    
}

}

