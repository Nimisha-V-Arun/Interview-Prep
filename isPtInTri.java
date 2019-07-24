import java.util.*;


public class isPtInTri {

    public static double findArea(int x1,int y1,int x2,int y2,int x3,int y3){
        return(Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
    }
    public static boolean isInside(int x1,int y1,int x2,int y2,int x3,int y3,int x, int y){
        double A = findArea(x1,y1,x2,y2,x3,y3);
        double A1 = findArea(x1,y1,x2,y2,x,y);
        double A2 = findArea(x1,y1,x,y,x3,y3);
        double A3 = findArea(x3,y3,x2,y2,x,y);
        if( A == A1+A2+A3 ){
            return true;
        }
        else return false;
        
    }
    public static void main(String args[]){

        // the first three pairs of elements belong to the triangle
        // the last pair belongs to the point
        if (isInside(0, 0, 20, 0, 10, 30, 05, 15)) {
            System.out.println("The point is within the triangle");
        }else{
            System.out.println("The point is outside the triangle");
        }

    }
}