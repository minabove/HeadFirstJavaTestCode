package LearnTheInheritAndPolymorphism;

import java.util.Scanner;

public class FundamentalInherit {

    public static void main(String[] args) {

        Student student = new Student("Lin","241536");
        student.ShowImage();

        Scanner in = new Scanner(System.in);
        String direction = in.nextLine();
        String name = in.nextLine();
        String schoolNum = in.nextLine();
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();

        GradOnWork one = new GradOnWork(direction,name,schoolNum,year,month,day);
        one.ShowImage();

        GradOnWork two = new GradOnWork(direction,name,schoolNum,year,month,day);
        two.ShowImage();

        GradOnWork three = new GradOnWork(direction,name,schoolNum,year,month,day);
        three.ShowImage();

        GradOnWork four = new GradOnWork(direction,name,schoolNum,year,month,day);
        four.ShowImage();

        GradOnWork five = new GradOnWork(direction,name,schoolNum,year,month,day);
        five.ShowImage();

        GradOnWork.showNum();



    }
}

class People
{
    protected String name;
    public People(){

    }
    public People(String aName){
        name = aName;
    }
    public void setName(String aName){
        name = aName;
    }
}

class Student extends People
{
    protected String schoolNum;
    public void setSchoolNum(String num){
        schoolNum = num;
    }
    public Student(){

    }
    public Student(String aName,String aSchoolNum){
        name = aName;
        schoolNum = aSchoolNum;
    }
    public void ShowImage(){
        System.out.println("Name = "+ name);
        System.out.println("SchoolNum = "+ schoolNum);
    }

}

class GradOnWork extends Student
{

    private static int num = 0;
    private BirthDate date;
    private String direction;
    public GradOnWork(String aDirection,String aName,String aSchoolNum,int y,int m,int d){
        direction = aDirection;
        name = aName;
        schoolNum = aSchoolNum;
        date = new BirthDate(y,m,d);

    }
    public void ShowImage(){
        System.out.println("This is a graduate on work who specializes in "+direction);
//        System.out.println("Name = "+ name);
//        System.out.println("SchoolNum = "+ schoolNum);
        super.ShowImage();
        date.ShowBirth();
        num++;
    }

    public static void showNum(){
        System.out.println(num);
    }
   // public static int nme = 99;

}

class BirthDate
{
    private int year;
    private int month;
    private int day;
    public BirthDate(int y,int m,int d){
        year = y;
        month  = m;
        day = d;
    }
    public void ShowBirth(){
        System.out.println("Born on "+year+"."+month+"."+day);
    }
}