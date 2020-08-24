public class SoldOutExcepiton extends RuntimeException{
    private String message;
    public SoldOutExcepiton(String string){
        this.message = string;
    }

    public String gerMessage(){
        return message;
    }
    
}