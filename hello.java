class Mater{
   public void petter(){
    System.out.println("My name is petter");
   } 
   public int add(int n,int m){
    return (n+m);
   }
}
public class hello {
    public static void main(String[] a) {
        System.out.println("Hellow world");
        int num[][]=new int[3][4];
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                num[i][j]=i+j;
            }
        } 
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        } 

    }
    
}
