package rpg_lab;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class HeroTest {

    private static final int TARGET_EXPERIENCE = 100;
    private static final String HERO_NAME = "Pesho";

    @Test
    public void testAttackGainsExperienceWhenTargetIsDead() {
        Target targetMock = Mockito.mock(Target.class);
        Weapon weaponMock = Mockito.mock(Weapon.class);
        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(TARGET_EXPERIENCE);

        Hero hero = new Hero(HERO_NAME, weaponMock);

        hero.attack(targetMock);

        Assert.assertEquals(TARGET_EXPERIENCE, hero.getExperience());
    }

    @Test
    public void testCollectItemInInventoryWhenTargetIsDead() {
        Target targetMock = Mockito.mock(Target.class);
        Weapon weaponMock = Mockito.mock(Weapon.class);

        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveLoot()).thenReturn(weaponMock);


        Hero hero = new Hero(HERO_NAME, weaponMock);

        hero.attack(targetMock);
        Assert.assertEquals(1, hero.getInventory().size());


    }
}