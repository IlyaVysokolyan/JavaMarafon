package day11.Hero;

import day11.Hero.Hero;
import day11.Warrior;
import day11.interfaces.Healer;
import day11.interfaces.PhysAttack;

public class Paladin extends Hero implements PhysAttack, Healer {

    private double physDef;
    private double magicDef;
    private int physAtt;


    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public double getPhysDef() {
        return physDef;
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if (getHealth() > getMaxHealth()) setHealth(getMaxHealth());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(getHealth() + 10);
        if (hero.getHealth() > getMaxHealth()) hero.setHealth(getMaxHealth());
    }

    @Override
    public void physicalAttack(Hero hero) {

        if (hero instanceof Warrior)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Warrior) hero).getPhysDef()));
        if (hero instanceof Magician) hero.setHealth(hero.getHealth() - physAtt);
        if (hero instanceof Shaman)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Shaman) hero).getPhysDef()));
        if (hero.getHealth() < getMinHealth()) hero.setHealth(getMinHealth());

    }

    @Override
    public String toString() {
        return "Paladin {" + super.toString();
    }
}


