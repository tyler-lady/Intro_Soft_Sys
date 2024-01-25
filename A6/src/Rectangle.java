public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        System.out.println("New Rectangle!");
    };

    public String printShape(int n, String shape){

        if(n <= this.length){
            shape += printShape(n+1, "*".repeat(this.width) + "\n");
        }

        return shape;
    };
}
