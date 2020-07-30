public class LongestDay {

    public static void main(String[] args) {



        String [] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday","jrgkrdjgrgkjf"};


        String longestDay = "" ;



        for (int i = 0; i < days.length; i++) {

            if(days[i].length()>longestDay.length()){

                longestDay=days[i];
            }

        }

        System.out.println(" The longest day " + longestDay);




    }
}
