public class cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private DigitalVideoDisc items0rdered[]= new DigitalVideoDisc[20];
    private int qtyordered=0;
    public void  addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyordered>20){
            System.out.println("The cart if almost full");
        }
        else{
            items0rdered[qtyordered++]=disc;
            System.out.println("the disc has been added");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i=0;i<qtyordered;i++){
            if(items0rdered[i]==disc){
                int k=i;
                while(k<qtyordered){
                    items0rdered[k]=items0rdered[k+1];
                    k++;
                }
                qtyordered-=1;
                System.out.println("the disc has been removed");
            }
        }
    }
    public int qnt(){
        return qtyordered;
    }
    public void totalcost(DigitalVideoDisc disc){
        System.out.println("total cost is " + disc.getcost());
    }
    }

