public class Arrow extends GameObject{
    private int range;
    private String direction;
    public Arrow(int AttackSpunX, int AttackSpunY, String direction){
        super(AttackSpunX,AttackSpunY, 8, 8,1, 2 , 5,true);
        this.range=64;
        this.direction=direction;
    }

}