// package thirteen_OOPS;

public class Opps {
    public static void main(String[] args) {
        // pen (static inner class): seedha object ban jata hai
        pen p1 = new pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println("Pen color: " + p1.color);
        System.out.println("Pen tip: " + p1.tip);

        // student (non-static inner class): pehle Opps ka object chahiye
        Opps outer = new Opps();
        student s1 = outer.new student();
        s1.name = "Rahul";
        s1.age = 20;
        s1.cgpa(80, 70, 90);
        System.out.println("Student: " + s1.name + ", age " + s1.age);
        System.out.println("Percentage: " + s1.percentage);
    }

    static class pen {
        String color;
        int tip;

        void setColor(String newColor) {
            color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }

    class student {
        String name;
        int age;
        float percentage;

        void cgpa(int phy, int chem, int java) {
            percentage = (phy + chem + java) / 3.0f;
        }
    }
}
