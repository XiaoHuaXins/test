package entity;

public class Lonin {
    private String name ;
    private String id;
    private String pwd;

    public Lonin(String id,String pwd){
        this.id = id;
        this.pwd = pwd;
    }
    public Lonin(String name,String id,String pwd){
        this.name = name;
        this.id = id ;
        this.pwd = pwd ;
    }
    public Lonin(String id){
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
