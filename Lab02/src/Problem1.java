public class Problem1 {

    static final float inToMM = 25.4F;

    private static float convertToMM(float num){
        return num * inToMM;
    }

    private static void displayDimensions(float x, float y){
        System.out.println("Dimensions: " + convertToMM(x) + " X " + convertToMM(y) + " millimeters");
    }

    private static void displayPerimeter(float x, float y){
        float xLength = 2 * x;
        float yLength = 2 * y;
        float perimeter = xLength + yLength;
        System.out.println("Perimeter : " + convertToMM(perimeter) + " millimeters");
    }

    private static void displayDiagonalLength(float x, float y){
        float c = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Diagonal Length : " + convertToMM(c) + " millimeters");
    }

    public static void main(String[] args) {
        float x = 8.5F;
        float y = 11F;
        displayDimensions(x, y);
        displayPerimeter(x, y);
        displayDiagonalLength(x, y);
    }
}
