package org.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class ModifyMatrix {

    public static void main(String[] args) {
        modifiedMatrix(new int[][]{{2,-1,2,-1,2},
                {1,0,-1,2,-1},{2,-1,-1,-1,2},{2,1,2,-1,2},{0,1,0,0,0},
        {0,0,0,0,-1},{2,-1,2,2,0},{0,1,0,2,2},{2,2,0,1,-1}});
    }

    public static int[][] modifiedMatrix(int[][] matrix) {
        for (int i=0; i<matrix[0].length; i++){
            List<Integer> indexes = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for(int j=0; j<matrix.length; j++){
                if(matrix[j][i] == -1){
                    indexes.add(j);
                }
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }
            if(!indexes.isEmpty()){
                for(Integer integer : indexes){
                    matrix[integer][i] = max;
                }
            }
        }
        return matrix;
    }
}
