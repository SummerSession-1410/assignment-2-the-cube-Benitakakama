package com.example.project;

public class Cube {
	
	static String [] [] [] cube = {
		{
			{"0b", "1b", "2b"},
			{"3b", "4b", "5b"},
			{"6b", "7b", "8b"}
		},
		{
			{"0g", "1g", "2g"},
			{"3g", "4g", "5g"},
			{"6g", "7g", "8g"}
		},
		{
			{"0r", "1r", "2r"},
			{"3r", "4r", "5r"},
			{"6r", "7r", "8r"}
		},
		{
			{"0o", "1o", "2o"},
			{"3o", "4o", "5o"},
			{"6o", "7o", "8o"}
		},
		{
			{"0w", "1w", "2w"},
			{"3w", "4w", "5w"},
			{"6w", "7w", "8w"}
		},
		{
			{"0y", "1y", "2y"},
			{"3y", "4y", "5y"},
			{"6y", "7y", "8y"}
		}
	};

    static void showFace(String [][] face) {
         for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print (face[i][j]);
            System.out.println();
         }
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
    

    public static void main (String[] args) {

        showFace(cube[0]);
        rotateFace(cube[0], false);
        System.out.println();
        showFace(cube[0]);

    }
}
