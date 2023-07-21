package oop15;
//
public class Rectangl extends Figure {
    private float width;

    private  float height;

    Rectangl(float x, float y, float width, float height){
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public float getPerimetr(){
        return (width+height)*2;
    }
    public float getArea(){
        return width*height;
    }



}
