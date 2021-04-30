public class Student extends Person{
    private double gpa;
    private int id;

    public Student(String name, String email, int age, double gpa, int id) {
        super(name, email, age);

//        setName(name);
//        setEmail(email);
//        setAge(age);
        this.gpa = gpa;
        this.id = id;
    }
    public Student() {

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("GPA: "+gpa);
        System.out.println("ID: "+id);
    }

    @Override
    public String toString() {
        return getName()+"\n"+getEmail()+"\n"+getAge();
    }
}
