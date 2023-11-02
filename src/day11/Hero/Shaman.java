package day11.Hero;

import day11.Hero.Hero;
import day11.Warrior;
import day11.interfaces.Healer;
import day11.interfaces.MagicAttack;
import day11.interfaces.PhysAttack;

public class Shaman extends Hero implements MagicAttack, PhysAttack, Healer {

    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;

    public Shaman() {
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.physAtt = 10;
        this.magicAtt = 15;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        if (getHealth() > 100) setHealth(getMaxHealth());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + 30);
        if (hero.getHealth() > getMaxHealth()) hero.setHealth(getMaxHealth());
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero instanceof Warrior)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Warrior) hero).getPhysDef()));
        if (hero instanceof Paladin)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Paladin) hero).getPhysDef()));
        if (hero instanceof Magician) hero.setHealth(hero.getHealth() - physAtt);
        if (hero.getHealth() < getMinHealth()) hero.setHealth(getMinHealth());

    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero instanceof Warrior) hero.setHealth(hero.getHealth() - magicAtt);
        if (hero instanceof Paladin)
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * ((Paladin) hero).getMagicDef()));
        if (hero instanceof Magician)
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * ((Magician) hero).getMagicDef()));
        if (hero.getHealth() < getMinHealth()) hero.setHealth(getMinHealth());
    }

    @Override
    public String toString() {
        return "Shaman {" + super.toString();
    }

}
