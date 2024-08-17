package factory;


public class demo{
public static void main(String[] args)
{
Game game=Game.getInstance();
GameElementFactory easyLevelFactory=new EasyLevelFactory();
game.setLevelFactory(easyLevelFactory);
game.play();
System.out.println("------------");
GameElementFactory hardLevelFactory=new HardLevelFactory();
game.setLevelFactory(hardLevelFactory);
game.play();
}
private GameElementFactory factory;
public Weapon createWeapon()
{
return new DaggerWeapon();
}
public HealthPowerUp createPowerUp()
{
return new HealthPowerUp();
}
public void setLevelFactory(GameElementFactory factory)
{
this.factory = factory;
}
public void play()
{
GoblinEnemy enemy=factory.createEnemy();
Weapon weapon=factory.createWeapon();
PowerUp powerup=factory.createPowerUp();
enemy.attack();
weapon.use();
powerup.activate();
}
}