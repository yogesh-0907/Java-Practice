public class RectangleAreaFinder {
    
    private double length,breadth;

    public double Area(){
        return length*breadth;
    }

    public void getLengthBreadth(double length,double breadth){
        if(length > 0 && breadth > 0){
            this.length = length;
            this.breadth = breadth;
        }
    }

    public static void main(String args[]){
        RectangleAreaFinder rect = new RectangleAreaFinder();
        rect.getLengthBreadth(1.236,2.133);
        System.out.println("Area of the rectangle : "+rect.Area());
    }

}
