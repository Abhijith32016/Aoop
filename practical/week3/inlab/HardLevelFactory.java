package factory;

public class HardLevelFactory implements GameElementFactory
{
public SwordWeapon createWeapon()
{
return new SwordWeapon();
}
public ShieldPowerUp createPowerUp()
{
return new ShieldPowerUp();
}
@Override
public GoblinEnemy createEnemy() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createEnemy'");
}

}