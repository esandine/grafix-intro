import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Grafix{
    //pixel class for each pixel
    private class Pixel{
	//instance variables of pixel
	private int r;
	private int g;
	private int b;
	//constructors
	public Pixel(int r, int g, int b){
	    setR(r);
	    setG(g);
	    setB(b);
	}
	public Pixel(){
	    this(0,0,0);
	}
	//mutators
	public void setR(int r){
	    r=r;
	}
	public void setG(int g){
            g=g;
        }
        public void setB(int b){
            b=b;
        }
	//accessors
	public int getR(){
	    return r;
	}
	public int getG(){
            return g;
	}
        public int getB(){
            return b;
	}
	public String toString(){
	    return ""+getR()+" "+getG()+" "+getB()+"\n";
	}
    }
    //instance variables of writer
    private int width;
    private int height;
    private Pixel[][] data;
    public Grafix(int width, int height){
	setWidth(width);
	setHeight(height);
	data = new Pixel[width][height];
	for(int i = 0; i< width; i++){
	    for(int j = 0; j< height; j++){
		data[i][j]=new Pixel();
	    }
	}
    }
    public Grafix(){
	this(500,500);
    }
    //mutators
    public void setWidth(int w){
	width = w;
    }
    public void setHeight(int h){
	height = h;
    }
    //accessors
    public int getWidth(){
        return width;
    }
    public int getHeight(){
	return height;
    }
    //getData converts all of the pixel data to a string
    public String printData(){
	String retStr = "P3 ";
	retStr+=getWidth();
	retStr+=" ";
	retStr+=getHeight();
	retStr+=" 255\n";
	for(int i = 0; i< getWidth(); i++){
	    for(int j = 0; j< getHeight(); j++){
		//System.out.println(data[i][j].toString());
		retStr+=data[i][j].toString();
	    }
	}
	return retStr;
    }
    public void fun(){
	for(int i = 0; i < getWidth(); i++){
	    for(int j = 0; j< getHeight();j++){
		data[i][j].setR((i+j)%256);
		data[i][j].setG((i-j)%256);
		data[i][j].setB((i*j)%256);
	    }
	}
    }
    //Write function copies the pixels to image file
    public void write(String name){
	try{
	    File f = new File(name);
	    f.delete();
	    f.createNewFile();
	    FileWriter w = new FileWriter(f, true);
	    w.write("P3 "+getWidth()+" "+getHeight()+" 255\n");
	    for(int i = 0; i< getWidth(); i++){
		for(int j = 0; j< getHeight(); j++){
		    w.write(data[i][j].toString());
		}
	    }
	    w.close();
	}catch(IOException e){
	    System.out.println("IO Error PANIC");
	}
    }
}
