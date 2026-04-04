public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String gettitle() {
        return title;
    }
    public String getcategory() {
        return category;
    }
    public String getdirector() {
        return director;
    }
    public int getlenth() {
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

}

