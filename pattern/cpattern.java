public class cpattern{
    public static void main(String[] args){
       String str="jatin";
       System.out.println(str);
        for(int i=0;i<9;i++){

            for(int j=0;j<=i;j++){
                if(i%2==0)
                System.out.print("*");
                }           
            System.out.println();
        }
    }
}