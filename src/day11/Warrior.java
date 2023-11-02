package day11;

import day11.Hero.Hero;
import day11.Hero.Magician;
import day11.Hero.Paladin;
import day11.Hero.Shaman;
import day11.interfaces.MagicAttack;
import day11.interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {


    private double physDef;
    private double magicDef;
    private int physAtt;

    public Warrior() {
        this.physDef = 0.8;
        this.magicDef = 0;
        this.physAtt = 30;
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


    @Override
    public void physicalAttack(Hero hero) {
        if (hero instanceof Paladin)
            (hero).setHealth(hero.getHealth() - (physAtt - physAtt * ((Paladin) hero).getPhysDef()));
        if (hero instanceof Magician) hero.setHealth(hero.getHealth() - physAtt);
        if (hero instanceof Shaman)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Shaman) hero).getPhysDef()));
        if (hero.getHealth() < getMinHealth()) hero.setHealth(getMinHealth());

    }

    @Override
    public String toString() {
        return "Warrior {" + super.toString();
    }
}
