public class Teacher  extends Person{
    private String dept;
    private int numCourses;

    public Teacher(String name, String email, int age, String dept, int numCourses) {
        super(name, email, age);
        this.dept = dept;
        this.numCourses = numCourses;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Dept: "+dept);
        System.out.println("Courses No.: "+numCourses);
    }
}
