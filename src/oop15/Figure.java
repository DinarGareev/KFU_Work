package oop15;

abstract class Figure {
    float x;
    float y;

    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    //созд абстр методы/ реализ сделаем в наслед классах
    public abstract float getPerimetr();

    public abstract float getArea();

}
