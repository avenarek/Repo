package model;

public class Director extends Human{

    private String pechat;


    public Director(String fullName, int age, char gender, String pechat) {
        super(fullName, age, gender);
        this.pechat = pechat;
    }

    public String getPechat() {
        return pechat;
    }

    public void setPechat(String pechat) {
        this.pechat = pechat;
    }
}
