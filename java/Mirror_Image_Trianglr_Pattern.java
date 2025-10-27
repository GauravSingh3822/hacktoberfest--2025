package Pattern_Question;

public class Mirror_Image_Trianglr_Pattern {
    public static void Mirror_Image_Trianglr_Pattern(int n){
        int row,col,space;
        // Upper Part
                for(row=1;row<=n;row++){
                    for(space=1;space<=row;space++){
                        System.out.print(" ");
                    }
                    for(col=row;col<=n;col++){
                        System.out.print(col+" ");
                    }
                    System.out.println();
                }
        // Lower Part
        for(row=n-1;row>=1;row--){
            for(space=1;space<=row;space++){
                System.out.print(" ");
            }
            for(col=row;col<=n;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Mirror_Image_Trianglr_Pattern(6);
    }
}
package Pattern_Question;

public class Diamond_Pattern {
    static void Diamond_Pattern(int n){
        // Upper part
        int row,col,space;
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part (repeat from row=1 to n-1, but reverse shape)
        for(row = 1; row <=n-1; row++){
            for(space = 1; space <= row; space++){
                System.out.print(" ");
            }
            for(col = 1; col <= 2 * (n - row)-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
           Diamond_Pattern(5);
    }
}
package Pattern_Question;

public class Butterfly_Pattern {
    static void Butterfly_Pattern(int n){
        int row, col, space;
//==================================================================================
        // Upper part
        for(row=1;row<=n;row++){
            // Left Stars
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            // Space
            for(space=1;space<=2*(n-row);space++){
                System.out.print(" ");
            }
            // Right Star
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
//==================================================================================
        // Lower part
        for (row = 2; row <= n; row++) {
            // Left stars
            for (col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            // Spaces
            for (space = 1; space <= 2 * (row-1); space++) {
                System.out.print(" ");
            }
            // Right stars
            for (col = 1; col <= n-row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly_Pattern(6);
    }
}
