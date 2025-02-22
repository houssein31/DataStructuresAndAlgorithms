package javaPrep.interviewQuestions;

import java.util.ArrayList;
import java.util.List;


public class performUpdate {

    public static List<Integer> getFinalData(List<Integer> data, List<List<Integer>> updates) {
        ArrayList<Integer> dataArray = new ArrayList<> (data);

        for(int i = updates.get(0).get(0)-1; i<=updates.get(0).get (1)-1; i++)
            dataArray.set ( i, dataArray.get ( i ) * (-1) );

        for(int j = updates.get(1).get(0)-1; j<=updates.get (1).get(1)-1; j++)
            dataArray.set ( j, dataArray.get ( j ) * (-1) );

        return dataArray;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of (1, -4, -5, 2);
        List<List<Integer>> listX = List.of (List.of (2, 4), List.of (1, 2));

        System.out.println (getFinalData (list1, listX));
    }
}
