import java.util.Arrays;

public class Student {

    String name ;
    int marks[] ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }




    public Student ( String name , int marks[]){

        this.name = name ;
        this.marks = marks;
    }


    // to get number of marks - {34,56,76}

    public int getNumberOfNumbers(){

        return this.marks.length;
    }

    public int getTotalmarks (){

        int sum=0;

        for(int mark : this.marks)
        {
            sum= sum+mark;
        }


        return sum;
    }

    public  int getMaximumMarks()
    {

        Arrays.sort(this.marks);
        return this.marks[this.marks.length-1];


    }

    public int getMinimumMarks(){
        Arrays.sort(this.marks);
        return this.marks[0];
    }

    // HOme -



}
