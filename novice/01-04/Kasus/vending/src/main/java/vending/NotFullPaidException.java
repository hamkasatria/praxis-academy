public class NotFullPaidException extends RuntimeException{
    private final String message;
    private final long remaining;

    public NotFullPaidException(final String massage, final long remaining) {
        this.message = message;
        this.remaining = remaining;
    }

    public ling getRemaining(){
        return remaining;
    }

    public String getMessage(){
        return message+remaining;
    }

}