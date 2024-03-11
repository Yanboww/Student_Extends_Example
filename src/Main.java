public class Main {
    public static void main(String[] args) {

        //Freshman
        Freshman f = new Freshman(14,"Joe",false,true);
        System.out.println(f.getName());
        System.out.println(f.getAge());
        f.giveHomeWork();
        f.freshManStuff();
        System.out.println(f.isLost());
        System.out.println(f.isTakeGeometry());

        //Senior
        System.out.println();
        Senior s = new Senior(17,"Sam",true,true);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.giveHomeWork();
        s.seniorStuff();
        System.out.println(s.isTookAp());
        System.out.println(s.isChill());
    }
}