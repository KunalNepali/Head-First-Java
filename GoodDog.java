public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){
        if(size > 60){
            System.out.println("RUFF!! RUFF!!");
        }
        else if(size > 14)
        {
            System.out.println("WOFF!! WOFF");
        }
        else{
            System.out.println("AAUUUUUU");
        }
    }
}

