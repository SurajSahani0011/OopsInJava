package GetterAndSetter3;


public class StudentUse {

    public static void main(String[] args){
        //Scanner s= new Scanner(source)
        Student s1;
        s1 = new Student();
        System.out.println(s1);
        s1.name="Manisha";
        //s1.rollNumber = 10;
        s1.setRollNumber(100);
        System.out.println(s1.name + " "+ s1.getRollNumber());

        Student s2= new Student();
        System.out.println("s2"+s2);
        s2.setRollNumber(100);
        //s2.name= "Ankush";
        //s2.rollNumber= 50;
        //System.out.println(s2.name + " ");
        //System.out.println(s2.name + " "+ s2.rollNumber);
        //System.out.println(s1.rollNumber);

    }

}
