package model.springmvc;

public class User {
    private String user_email;
    private String user_name;

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_email='" + user_email + '\'' +
                ", user_name='" + user_name + '\'' +
                '}';
    }
    public User(){
        super();
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
