package Mapper;

public class Person {
    private String Username;
    private String Id;
    private String Sex;
    private String Address;
    private String hobby;
    private boolean Graduated;
    public Person(String name,String Id,String Sex,String Address,String hobby,boolean Graduated){
        this.Id = Id;
        this.Username = name;
        this.Sex = Sex;
        this.Address = Address;
        this.hobby = hobby;
        this.Graduated = Graduated;
    }
    public Person(String Sex){
        this.Sex = Sex;
    }

    public boolean isGraduated() {
        return Graduated;
    }

    public void setGraduated(boolean graduated) {
        Graduated = graduated;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public  String toString(){
        return this.Username+","+this.Id+","+this.Sex+this.Address+this.hobby;
    }
}
