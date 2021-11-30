package inheritance;

class TV {
    //size, getSize
    private int size;
    public TV(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

}

class ColorTV extends TV{
    private int resolution;
    ColorTV(int size, int resolution){
        super(size);
        this.resolution = resolution; 
    }
    public void printProperty(){
        //32인치 1024컬러
        System.out.println(getSize()+"인치 "+ resolution +" 컬러");
    }
}
static class Main{
public static void main(String[] args) {
    ColorTV myTV = new ColorTV(32, 1024);
    myTV.printProperty();
 }
}