import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FileHandler {

    public FileHandler(){

    }

    public String handleShape(String[] parsed){
        System.out.println(Arrays.toString(parsed));

        int n = 1;

        //StringBuilder builder = new StringBuilder();
        String shape = "";

        switch (parsed[0]) {
            case "rhombus":
                try{
                    Rhombus r = new Rhombus(Integer.parseInt(parsed[1]));
                    shape = r.printShape(n, shape);
                }catch(IllegalArgumentException e){
                    //throwing an actual exception here of course breaks the program
                    //just alert there was an exception, tell the user what happened, and then move on
                    System.out.println("The height for a Rhombus must be odd!");
                    //throw new RuntimeException("This value must be odd!");
                }
                break;
            case "rectangle":
                if(parsed.length < 3)
                    break;
                Rectangle rect = new Rectangle(Integer.parseInt(parsed[1]), Integer.parseInt(parsed[2]));
                shape = rect.printShape(n, shape);
                break;
            case "triangle":
                Triangle t = new Triangle(Integer.parseInt(parsed[1]));
                shape = t.printShape(n, shape);
                break;
        }
        return shape;
    }

    public String creatNewFile(String fileName){
        System.out.println(fileName);
        String[] parsedFileName = fileName.split("\\.");
        String outputName = "OutputFiles" + "\\" + parsedFileName[0] + ".out";

        File newFile = new File(outputName);

        try {
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
                return outputName;
            } else {
                System.out.println("File already exists with that name.");
                return outputName;
            }
        } catch (IOException e ) {
            System.out.println("File could not be created");
        }
        return "";
    }

    public void parseFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path)); // reads the file
        String line; //create local variable to be used for each line
        String[] parsed; //local variable to hold the parsed lines

        String[] parsedPath = path.split("\\\\");
        String fileName = parsedPath[1];

        String outputName = this.creatNewFile(fileName);

        FileWriter writer;
        if(!outputName.equals("")){
             writer = new FileWriter(outputName);

            while((line = reader.readLine()) != null){ //assigns line using readline() and then checks if it's null // if so, end of file
                line = line.toLowerCase(); //converts all chars to lowercase

                parsed = line.split("\\s+"); // splits by whitespace
                writer.write(handleShape(parsed));
                writer.write("\n");
            }

            writer.close();
        }
    }

    public void readInput(){
        //BufferedReader reader = new BufferedReader(new FileReader());
        ArrayList<String> pathStrings = new ArrayList<>();

        try (Stream<Path> paths = Files.walk(Paths.get("InputFiles"))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(x -> {
                        System.out.println(x);
                        try {
                            parseFile(String.valueOf(x));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            //for path in paths -> parse file

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException{
        FileHandler handler = new FileHandler();
        handler.readInput();
    }
}
