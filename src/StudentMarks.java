public class StudentMarks implements Comparable<StudentMarks>{
    private int physics;

    public int getPhysics() {
        return physics;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "physics=" + physics +
                ", math=" + math +
                '}';
    }

    public StudentMarks(int physics, int math) {
        this.physics = physics;
        this.math = math;
    }

    private int math;


    @Override
    public int compareTo(StudentMarks o) {
        System.out.println("Comparable() compareTo called");
        return o.getMath()-this.getMath();
    }
}
