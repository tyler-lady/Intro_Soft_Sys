public class Rhombus {
    private int height;

    public Rhombus(int height) throws IllegalArgumentException{
        if(height%2 == 0)
            throw new IllegalArgumentException("This value can only be odd!");
        this.height = height;
        System.out.println("New Rhombus!");
    };

    public String printShape(int n, String shape){
        // n = 7
        int offset = n;
        int mid = Math.ceilDiv(this.height, 2);

        if(n > 1 && n < mid)
            offset = n+(n-1);
        else if(n>mid)
            offset = this.height-2;

        //if n > height then image done, return string
        if(n <= this.height){
            if(n < mid){
                int tmp = mid - n;
                String str = "";
                str+= " ".repeat(tmp) + "*".repeat(offset) + " ".repeat(tmp)  + "\n";
                shape += printShape(n+1, str);
            } else if(n == mid){
                shape += printShape(n+1, "*".repeat(this.height) + "\n");
            } else {
                int tmp = this.height-mid;
                String str = "";
                str+= " ".repeat(tmp) + "*".repeat(offset) + " ".repeat(tmp)  + "\n";
                shape += printShape(n+1, str);
            }
        }

        return shape;
    };
}
