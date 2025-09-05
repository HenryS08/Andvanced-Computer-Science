public class Rectangle {
    
    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth){
        length = newLength;
        width = newWidth;
    }
    public Rectangle(){
        length = 0;
        width = 0;
    }

    public String toString(){
        String details = "This rectangle has a length of "+ length + "and a width of "+ width +". Its area is "+ length*width + ".";
        return details;
    }

    public boolean equals(Rectangle other) {
        if 
        boolean equality = 
        return equality;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }

    public void setLength(int newLength){
        length = newLength;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }

}
