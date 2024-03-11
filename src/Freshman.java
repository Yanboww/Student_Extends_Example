public class Freshman extends Student{
    boolean lost;
    boolean takeGeometry;
    public Freshman(int age, String student,boolean lost, boolean takeGeometry)
    {
        super(age,student);
        this.takeGeometry = takeGeometry;
        this.lost = lost;
    }

    public void freshManStuff()
    {
        System.out.println("I am doing freshman stuff");
    }
    public boolean isLost() {
        return lost;
    }

    public boolean isTakeGeometry() {
        return takeGeometry;
    }
}
