package factory;

public class Game
{
private static Game instance;
private Game() { } 
public static Game getInstance()
{
if(instance==null)
{
instance=new Game();
}
return instance;
}
public void setLevelFactory(GameElementFactory easyLevelFactory) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setLevelFactory'");
}
public void play() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'play'");
}}