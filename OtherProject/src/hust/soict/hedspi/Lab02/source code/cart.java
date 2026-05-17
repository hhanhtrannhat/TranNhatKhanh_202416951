public class cart {
    public static final int MAX_NUMBERS_ORDERED =20;//so luong dia toi da
    private DigitalVideoDisc items0rdered[]= new DigitalVideoDisc[20];//khoi tao mang dia
    private int qtyordered=0;//so luong dia hien tai
    public void  addDigitalVideoDisc(DigitalVideoDisc disc){
        //khi ma dia da la 20 thi bao day, khong them duoc nua
        if(qtyordered>=20){
            System.out.println("The cart if almost full");
        }
        else{
        //con lai them binh thuong    
            items0rdered[qtyordered++]=disc;
            System.out.println("the disc has been added");
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
    }

