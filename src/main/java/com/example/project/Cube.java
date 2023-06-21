import java.util.Scanner;
public class RubiksCube {

    static String [][] Face = {
                                    {"0", "1", "2"},
                                    {"3", "4", "5"},
                                    {"6", "7", "8"}
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

        showFace(Face);
        rotateFace(Face, false);
        System.out.println();
        showFace(Face);

    }
}
