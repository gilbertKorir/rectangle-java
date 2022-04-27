public class Cube {
    private Rectangle mFace;

    public Cube(Rectangle rectangle) {
        mFace = rectangle;
    }
    public Rectangle getFace() {
        return mFace;
    }
    public int getVolume(){
        int length = mFace.getLength();
        return length * length * length;
    }
    public int getSurfaceArea(){
        return mFace.area()*6;
//        int surfaceArea = mFace.getLength()*mFace.getWidth();
//        return surfaceArea*6;
    }
}









