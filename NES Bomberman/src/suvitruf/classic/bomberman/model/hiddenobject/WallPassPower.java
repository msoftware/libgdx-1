package suvitruf.classic.bomberman.model.hiddenobject;



import com.badlogic.gdx.math.Vector2;

public class WallPassPower extends HiddenObject {
	public static String Name =  "wallpass";
	 public  WallPassPower(Vector2 pos){ 
			super(pos);
			state = State.NONE;
			name = "wallpass";
	 }
}
