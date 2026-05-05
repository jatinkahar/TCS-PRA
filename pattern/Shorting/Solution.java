
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int n=sr.nextInt();
        List<Driver> drivers=new ArrayList<>();
        for(int i=0;i<n;i++){
            Driver dr=new Driver(
                sr.nextInt(),
                sr.next(),
                sr.next(),
                sr.nextDouble()
            );
            drivers.add(dr);
        }
        String vType=sr.next();
        Driver res=help(drivers,vType);
        if(res==null){
            System.out.println("No driverr found");
        }
        else{
            System.out.print(n+"\n"+
                 res.getDriverId()+"\n"+
                 res.getDriverName()+"\n"+
                 res.getVehicleType()+"\n"+
                 res.getMilesDriven());
        }
        
    }
    public static Driver help(List<Driver> drivers,String vType){
        
       Driver max=null;
       for(Driver i:drivers){
        if(i.getVehicleType().equalsIgnoreCase(vType)){
            if(max == null|| max.getMilesDriven() < i.getMilesDriven()){
                max=i;
            }
            return max;
        }
     
       }
       return null;
           
    }
}
class Driver{
    private int driverId;
    private String driverName;
    private String vehicleType;
    private double milesDriven;
    public Driver(int driverId ,String driverName,String vehicleType,double milesDriven){
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehicleType = vehicleType;
        this.milesDriven = milesDriven;
    }
    public int getDriverId(){return driverId;}
       public String getDriverName(){return driverName;}
        public String getVehicleType(){return vehicleType;}
       public double getMilesDriven(){return milesDriven;}
}

