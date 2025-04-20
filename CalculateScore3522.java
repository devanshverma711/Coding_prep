
import java.util.ArrayList;

class CalculateScore3522{
    public static void main(String[] args) {
        String []  instructions = {"jump","add","add","jump","add","jump"};
        int [] values = {2,1,3,1,-2,-3};
        System.out.println(calculateScore(instructions,values));
    }
    static long calculateScore(String[] instructions, int[] values){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n= values.length;
        int i=0;
        long score =0;
        while(i<n && i>=0){
            if(list.contains(i)){
                    return score;
                }
            else{
                list.add(i);
            }
            if(instructions[i]=="jump"){
                i+=values[i];
                continue;

            }
            if(instructions[i]=="add"){
                score+=values[i];
                i+=1;
                continue;
            }
        }
        return score;
    }
}