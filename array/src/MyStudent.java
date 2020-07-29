import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyStudent {

   private  String name ;
    private ArrayList<Integer> marks = new ArrayList();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }



    MyStudent(String name , ArrayList marks){

        this.name=name;
        this.marks=marks;
    }

    public int getMaximummarks(){

        if(this.marks.size()>0)

        return  Collections.max(this.marks);

        else

            return 0;

    }

public int getMinimum (){

    if(this.marks.size()>0)
        return Collections.min(this.marks);
    else return 0;
}

public void addmarks(int newSubjectMarks){

        this.marks.add(newSubjectMarks);
}



}
