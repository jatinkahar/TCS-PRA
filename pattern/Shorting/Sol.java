import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        List<Vehicle> dev=new ArrayList<>();
        for(int i=0;i<n;i++){
            Vehicle dt=new Vehicle(
                sc.nextInt(),
                sc.next(),
                sc.next(),
                sc.nextDouble()
            );
            dev.add(dt);
        }
        String input=sc.next();
        Vehicle res=help(dev,input);
        if(res==null){
            System.out.print("No Vehicle Found");
        }
        else{
            System.out.println(res.getId());
            System.out.println(res.getName());
            System.out.println(res.getPrice());
        }
    }
    public static Vehicle help(List<Vehicle> dev,String input){
        Vehicle low=null;
        Vehicle slow=null;
        
        for(Vehicle i : dev){
            
          if(i.getType().equalsIgnoreCase(input)){
              if(i.getName().toLowerCase().contains("e")){
                if(low==null||i.getPrice() <low.getPrice()){
                    slow=low;
                    low=i;
                }
                else if(i.getPrice()>low.getPrice()){
                    if(slow==null||i.getPrice()<slow.getPrice()){
                        slow=i;
                    }
                }
            }
          }
        }
        return slow;

    }

}



class Vehicle{
    private int id;
    private String name;
    private String type;
    private double price;
    public Vehicle(int id, String name,String type,double price){
        this.id=id;
        this.name=name;
        this.type=type;
        this.price=price;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getType(){return type;}
    public double getPrice(){return price;}
}