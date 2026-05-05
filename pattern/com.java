import java.util.*;


class Bus{
       private int id;
       private String bname;
       private String starting;
       private String ending;

       public Bus(int id,String bname, String starting, String ending){
        this.id=id;
        this.bname=bname;
        this.starting=starting;
        this.ending=ending;

       }
       public int getid(){return id;}
       public String getbname(){return bname;}

}

public class com{

public static void main(String[] args){
    
    Scanner sr=new Scanner(System.in);
    int n=Integer.parseInt(sr.nextLine().trim());
    List<Bus> buses=new ArrayList<>();

    for(int i=0;i<n;i++){
        int id=Integer.parseInt(sr.nextLine().trim());
        String bname=sr.nextLine().trim();
        String starting=sr.nextLine().trim();
        String ending=sr.nextLine().trim();

        buses.add(new Bus(id,bname,starting,ending));
    }

    System.out.println(buses);

}
}
