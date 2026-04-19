package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;//so luong dia toi da
    private DigitalVideoDisc items0rdered[]= new DigitalVideoDisc[20];//khoi tao mang dia
    private int qtyordered=0;//so luong dia hien tai
    public void  addDigitalVideoDisc(DigitalVideoDisc disc){
        //khi ma dia da la 20 thi bao day, khong them duoc nua
        if(qtyordered>=MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full");
        }
        else{
        //con lai them binh thuong    
            items0rdered[qtyordered++]=disc;
            System.out.println("the disc has been added");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc Disc1, DigitalVideoDisc Disc2){
            if(qtyordered>=MAX_NUMBERS_ORDERED){
                System.out.println("The cart is almost full");
            }
            else{
                items0rdered[qtyordered++]=Disc1;
                System.out.println("Disc1 has been added");
                if(qtyordered>=MAX_NUMBERS_ORDERED){
                    System.out.println("The cart is almost full, cannot add disc2");
                }
                else{
                    items0rdered[qtyordered++]=Disc2;
                    System.out.println("Disc2 has been added");
                }
            }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        int len=dvdList.length;
        for(int i=0;i<len;i++){
            if(qtyordered<MAX_NUMBERS_ORDERED){
                items0rdered[qtyordered++]=dvdList[i];
            }
            else{
                System.out.println("The cart is almost full, cannot add disc" + i);
            }
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        //duyet qua toan bo mang neu co ton tai phan tu can xoa thi xoa
        for(int i=0;i<qtyordered;i++){
            if(items0rdered[i]==disc){
                int k=i;
                while(k<qtyordered){
                    items0rdered[k]=items0rdered[k+1];
                    k++;
                }
                qtyordered-=1;//so luong giam di 1
                System.out.println("the disc has been removed");
            }
        }
    }
    public int qnt(){
        return qtyordered;//ham kiem tra so luong dia
    }
    //ham tinh tong so tien dia trong cart
    public float totalcost(){
        float total=0;
        for(int i=0;i<qtyordered;i++){
            total+=items0rdered[i].getcost();
        }
        return total;
    }
    public void printcart(){
        for(int i=0;i<qtyordered;i++){
            System.out.println(items0rdered[i].toString());
        }
    }
    public void searchbyid(int id){
        boolean matchFound=false;
        for(int i=0;i<qtyordered;i++){
            if(items0rdered[i].getid()==id){
                matchFound=true;
                System.out.println("da tim thay "+items0rdered[i].toString());
                break;
            }
        }
        if(!matchFound){
            System.out.println("khong tim thay");
        }
    }
    public void searchbytitle(String title){
        boolean matchFound=false;
        for(int i=0;i<qtyordered;i++){
            if(items0rdered[i].gettitle().equalsIgnoreCase(title)){
                matchFound=true;
                System.out.println("da tim thay "+items0rdered[i].toString());
            }
        }
        if(!matchFound){
            System.out.println("khong tim thay");
        }
    }
    }


