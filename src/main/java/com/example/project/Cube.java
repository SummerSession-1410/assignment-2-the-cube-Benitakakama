package com.example.project;
import java.util.Scanner;

public class Cube {
	
	static String [] [] [] cube = {
		{
			{"b", "b", "b"},
			{"b", "b", "b"},
			{"b", "b", "b"}
		},
		{
			{"g", "g", "g"},
			{"g", "g", "g"},
			{"g", "g", "g"}
		},
		{
			{"r", "r", "r"},
			{"r", "r", "r"},
			{"r", "r", "r"}
		},
		{
			{"o", "o", "o"},
			{"o", "o", "o"},
			{"o", "o", "o"}
		},
		{
			{"w", "w", "w"},
			{"w", "w", "w"},
			{"w", "w", "w"}
		},
		{
			{"y", "y", "y"},
			{"y", "y", "y"},
			{"y", "y", "y"}
		}
	};

    static void showFace(String [][] face) {
         for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
				if(j != 0) {
					System.out.print("|");
				}
                System.out.print (face[i][j]);
			}
            System.out.println();
         }
    }

	public static void showCube() {
		showFace(cube[2]);
		System.out.println();
		showFace(cube[0]);
		System.out.println();
		showFace(cube[3]);
		System.out.println();
		showFace(cube[1]);
		System.out.println();
		showFace(cube[5]);
		System.out.println();
		showFace(cube[4]);
	}

    static void rotateFace(String [][] face, boolean clockwise) {
        String[][] tempface = new String [3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                tempface[i][j] = face[i][j];
        
        if(clockwise) {
            for(int i = 0; i < 3; i++)
                for(int j = 0; j < 3; j++)
                    face[j][2-i] = tempface[i][j];
        
        }
        else{
            for(int i = 0; i < 3; i++)
                for(int j = 0; j < 3; j++)
                    face[2-j][i] = tempface[i][j];
        }
    }
    
	public static void rotateBlue(boolean clockwise) {
		rotateFace(cube[0], clockwise);
		for(int i = 0; i < 3; i++ ) {
			if (clockwise) {
				String temp = cube[5][2][i];
				cube [5][2][i] = cube[3][2 - i][2];
				cube[3][2 - i][2] = cube [4][0][2 - i];
				cube [4][0][2 - i] = cube [2][i][0];
				cube [2][i][0] = temp;
			}
			else{
				String temp = cube [2][i][0];
				cube [2][i][0] = cube [4][0][2 - i];
				cube [4][0][2 - i] = cube[3][2 - i][2];
				cube[3][2 - i][2] = cube [5][2][i];
				cube[5][2][i] = temp;
			}			
		}
	}

	public static void rotateRed(boolean clockwise) {
		rotateFace(cube[2], clockwise);
		for(int i = 0; i < 3; i++ ) {
			if (clockwise) {
				String temp = cube[5][2 - i][2];
				cube[5][2 - i][2] = cube[0][2 - i][2];
				cube[0][2 - i][2] = cube [4][2 - i][2];
				cube [4][2 - i][2] = cube [1][2 - i][2];
				cube [1][2 - i][2] = temp;
			}
			else{
				String temp = cube [1][2 -i][2];
				 cube [1][2 - i][2] = cube [4][2 - i][2];
				cube [4][2 - i][2] = cube[0][2 - i][2];
				cube[0][2 - i][2] = cube[5][2 - i][2];
				cube[5][2 - i][2] = temp;
			}			
		}
	}
	public static void rotateGreen(boolean clockwise) {
		rotateFace(cube[1], clockwise);
		for(int i = 0; i < 3; i++ ) {
			if (clockwise) {
				String temp = cube[4][2][i];
				cube[4][2][i] = cube[3][i][0];
				cube[3][i][0] = cube [5][0][2 - i];
				cube [5][0][2 - i] = cube [2][2 - i][2];
				cube [2][2 - i][2] = temp;
			}
			else{
				String temp = cube [2][2 - i][2];
				 cube [2][2 - i][2] = cube [5][0][2 - i];
				cube [5][0][2 - i] = cube[3][i][0];
				cube[3][i][0] = cube[4][2][i];
				cube[4][2][i] = temp;
				
			}			
		}
	}
	public static void rotateOrange(boolean clockwise) {
		rotateFace(cube[3], clockwise);
		for(int i = 0; i < 3; i++ ) {
			if (clockwise) {
				String temp = cube [5][i][0];
				cube [5][i][0] = cube [1][i][0];
				cube [1][i][0] = cube[4][i][0];
				cube[4][i][0] = cube[0][i][0];
				cube[0][i][0] = temp;
			}
			else{
				String temp = cube[0][i][0];
				cube[0][i][0] = cube[4][i][0];
				cube[4][i][0] = cube [1][i][0];
				cube [1][i][0] = cube [5][i][0];
				cube [5][i][0] = temp;
				
			}			
		}
	}
	public static void rotateWhite(boolean clockwise) {
		rotateFace(cube[4], clockwise);
		for(int i = 0; i < 3; i++ ) {
			if (clockwise) {
				String temp = cube [0][2][i];
				cube [0][2][i] = cube [3][2][i];
				cube [3][2][i] = cube[1][0][2 - i];
				cube[1][0][2 - i] = cube[2][2][i];
				cube[2][2][i] = temp;
			}
			else{
				String temp = cube[2][2][i];
				cube[2][2][i] = cube[1][0][2 - i];
				cube[1][0][2 - i] = cube [3][2][i];
				cube [3][2][i] = cube [0][2][i];
				cube [0][2][i] = temp;
				
			}			
		}
	}
	public static void rotateYellow(boolean clockwise) {
		rotateFace(cube[5], clockwise);
		for(int i = 0; i < 3; i++ ) {
			if (clockwise) {
				String temp = cube [1][2][i];
				cube [1][2][i] = cube [3][0][2 - i];
				cube [3][0][2 - i] = cube[0][0][2 - i];
				cube[0][0][2 - i] = cube[2][0][2 - i];
				cube[2][0][2 - i] = temp;
			}
			else{
				String temp = cube[2][0][2 - i];
				cube[2][0][2 - i] = cube[0][0][2 - i];
				cube[0][0][2 - i] = cube [3][0][2 - i];
				cube [3][0][2 - i] = cube [1][2][i];
				cube [1][2][i] = temp;
				
			}			
		}
	}




    public static void main (String[] args) {
		Scanner inputs = new Scanner(System.in);

		boolean exitProgram = false;
		while(!exitProgram){
		
		showCube();

		String blue = inputs.next();
		switch (blue) {
			case "B":
				rotateBlue(true);
				break;
			case "O":
				rotateOrange(true);
				break;
			case "Y":
				rotateYellow(true);
				break;
			case "G":
				rotateGreen(true);
				break;
			case "W":
				rotateWhite(true);
				break;
			case "R":
				rotateRed(true);
				break;

			case "B'":
				rotateBlue(false);
				break;
			case "O'":
				rotateOrange(false);
				break;
			case "Y'":
				rotateYellow(false);
				break;
			case "G'":
				rotateGreen(false);
				break;
			case "W'":
				rotateWhite(false);
				break;
			case "R'":
				rotateRed(false);
				break;

			case "Q":
				exitProgram = true;
				break;

	
		}
		}

        

    }
}
