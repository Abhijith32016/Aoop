package factory;

public class EasyLevelFactory implements GameElementFactory
{
public GoblinEnemy createEnemy()
{
return new GoblinEnemy();
}

@Override
public Weapon createWeapon() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createWeapon'");
}

@Override
public PowerUp createPowerUp() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createPowerUp'");
}}
