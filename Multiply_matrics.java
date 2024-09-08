/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiply_matrics;

/**
 *
 * @author Shimi
 */
public class Multiply_matrics {
   
    public static int[][] multiply_matrics(int[][] matA, int[][] matB) {
        int rowA = matA.length;
        int columnA = matA[0].length;
        int rowB = matB.length;
        int columnB = matB[0].length;

        if (columnA != rowB){
            System.out.println("Sorry cannot Multiply:(");
            return null;
        }

        int[][] result = new int[rowA][columnB];

        for (int x = 0; x < rowA; ++x){
            for (int y = 0; y < columnB; ++y){
                for (int k = 0; k < columnA; k++){
                    result[x][y] += matA[x][k] * matB[k][y];
                }
            }
        }

        return result;
    }

    public static void print(int[][] mat){
        for (int x = 0; x < mat.length; ++x){
            for (int y = 0; y < mat[0].length; ++y){
                System.out.print(mat[x][y] + " ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args){
        int[][] matA = {{2, 4}, 
                       {5, 2}};
        int[][] matB = {{1, 8}, 
                        {3, 4}};

        int[][] result = multiply_matrics(matA, matB);

        System.out.println("Answer = ");
        print(result);
    }
}
