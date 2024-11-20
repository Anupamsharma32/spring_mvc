package model.springmvc;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private String email;
  private List<String> subject;
  public Student(){
      super();
  }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject=" + subject +
                '}';
    }
}
