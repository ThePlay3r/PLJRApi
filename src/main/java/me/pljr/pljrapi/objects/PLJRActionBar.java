package me.pljr.pljrapi.objects;

public class PLJRActionBar {
    private final String message;
    private final long duration;

    public PLJRActionBar(String message, long duration){
        this.message = message;
        this.duration = duration;
    }

    public String getMessage() {
        return message;
    }
    public long getDuration() {
        return duration;
    }
}
