package demo.server;

public enum Sex {
    MALE, FEMALE;

    public static Sex fromValue(String val){
        return valueOf(val);
    }
    public String value(){
        return name();
    }
}
