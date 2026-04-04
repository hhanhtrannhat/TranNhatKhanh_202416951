public class laucher {
    public static void main(String[] args){
        DigitalVideoDisc disc=new DigitalVideoDisc();
        disc.settittle("ko loi");
        disc.setcategory("indie");
        disc.setcost(99);
        disc.setlength(99);
        disc.setdirector("j97");
        cart c1= new cart();
        c1.addDigitalVideoDisc(disc);
        System.out.println("quanity is " + c1.qnt());
        c1.totalcost(disc);  
    }
    
}
