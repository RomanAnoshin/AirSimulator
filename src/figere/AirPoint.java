package figere;

/**
 * Created by Роман on 26.03.2017.
 */
public class AirPoint {
    private int x,y,h;

    public AirPoint(){
        this.h=10000;
        this.x=0;
        this.y=0;
    }
    public AirPoint(int x,int y){
        this.h=10000;
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getH(){
        return h;
    }
    public void setH(int h){
        this.h=h;
    }
}
