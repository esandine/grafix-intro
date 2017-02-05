import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Driver{
    public static void main(String[] args){
	Grafix g = new Grafix(500,500);
	System.out.println("No more newline characters!");
	g.write("test.ppm");
    }
}