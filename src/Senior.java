public class Senior extends Student {
    boolean tookAp;
    boolean chill;

    public Senior(int age, String name, boolean tookAp, boolean chill)
    {
        super(age,name);
        this.tookAp = tookAp;
        this.chill = chill;

    }

    public void seniorStuff()
    {
        System.out.println("I am doing senior stuff");
    }


    public boolean isTookAp() {
        return tookAp;
    }

    public boolean isChill() {
        return chill;
    }
}
