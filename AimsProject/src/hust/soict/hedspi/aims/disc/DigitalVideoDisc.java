package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs=0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    //khoi tao bang title
    public DigitalVideoDisc(String title){
        this.title=title;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
    }
    //khoi tao bang cate,title,cost
    public DigitalVideoDisc(String category, String title,float cost){
        this.title=title;
        this.category=category;
        this.cost=cost;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
    }
    //khoi tao bang direc,cate,title,cost
    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.title=title;
        this.category=category;
        this.director=director;
        this.cost=cost;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
    }
    //khoi tao bang tat ca thuoc tinh
    public DigitalVideoDisc(String director, String category, String title, float cost, int lenth){
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.length = lenth;
        nbDigitalVideoDiscs++;
        id=nbDigitalVideoDiscs;
    }
    public String gettitle() {
        return title;
    }
    public String getcategory() {
        return category;
    }
    public String getdirector() {
        return director;
    }
    public int getlength() {
        return length;
    }
    public float getcost() {
        return cost;
    }
    public void settittle(String title){
        this.title=title;
    }
    public void setcategory(String category){
        this.category=category;
    }
    public void setdirector(String director){
        this.director=director;
    }
    public void setlength(int length){
        this.length=length;
    }
    public void setcost(float cost){
        this.cost=cost;
    }
    public int getid(){
        return id;
    }
    @Override
    public String toString(){
        return "DVD"+"["+title+"] - "+"["+category+"] - "+"["+director+"] - "+"["+length+"]:"+"["+cost+"]$";
    }
}

