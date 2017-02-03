public abstract class writer{
    //pixel class for each pixel
    private class pixel{
	//instance variables of pixel
	private int r;
	private int g;
	private int b;
	//constructors
	public pixel(int r, int g, int b){
	    setR(r);
	    setG(g);
	    setB(b);
	}
	public pixel(){
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
    }
    //instance variables of writer
    private int width;
    private int height;
    private pixel[][];
    public writer(int height, int width){
	
    }
    //mutators
    public void setWidth(w){
	width = w;
    }
    public void setHeight(h){
	height = h;
    }
    //accessors
    public int getWidth(){
        return width;
    }
    public int getHeight(){
	return height;
    }
}
