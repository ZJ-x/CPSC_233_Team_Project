public class Direction{
    private boolean headUp, headDown, headRight,headLeft;
    public  Direction(){};

    public boolean getHeadUp(){
        return this.headUp;
    }

    public boolean getHeadDown(){
        return this.headUp;
    }

    public boolean getHeadLeft(){
        return this.headUp;
    }

    public boolean getHeadRight(){
        return this.headUp;
    }

    public void setStill(){
        this.headUp=false;
        this.headDown=false;
        this.headLeft=false;
        this.headRight=false;
    }

    
}