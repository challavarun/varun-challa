class mobile{
    String name;
    int price;
    static String manufacture;
    static {
        System.err.println("static method is calloed");
        manufacture = "india";
    }
   mobile(){
    System.out.println("constructor called");
    name="";
    price=200;
   }
}
class staticandconstruct{
    public static void main(String[] args) {
        mobile m1=new mobile();
        System.out.println(m1.manufacture);
    }
    
}