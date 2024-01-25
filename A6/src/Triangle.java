public class Triangle {
    private int length;

    public Triangle(int length){
        this.length = length;
        System.out.println("New Triangle!");
    };

    public String printShape(int n, String shape){

        if(n <= this.length){
            shape += printShape(n+1, "*".repeat(n) + "\n");
        }

        return shape;
    };
}
