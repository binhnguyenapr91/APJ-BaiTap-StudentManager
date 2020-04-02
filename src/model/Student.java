package model;

public class Student extends Person {
    private String id;
    private float score;
    private String email;

    public Student (){

    }
    public Student (String id, float score,String email){
        this.id = id;
        this.score = score;
        this.email = email;
    }

    public Student (Person person,String id, float score,String email){
        super(person.getName(),person.getGender(),person.getBirthday(),person.getAddress());
        this.id = id;
        this.score = score;
        this.email = email;
    }
    public Student (String name, String gender, String birthday, String address,String id, float score,String email){
        super(name, gender, birthday, address);
        this.id = id;
        this.score = score;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public float getScore() {
        return score;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student name: " + super.getName()
                + ", gender: "+ super.getGender()
                + ", birthday: "+super.getBirthday()
                + ", address: "+super.getAddress()
                + ", id: '" + id
                + ", score: " + score
                + ", email: " + email;

    }
    public void display(Student st){
        System.out.printf("%-20s%-10s%-10s%-15s%-10s%-10s%-10s\n",st.getName(),st.getGender(),st.getBirthday(),st.getAddress(),st.getId(),st.getScore(),st.getEmail());
    }
}
