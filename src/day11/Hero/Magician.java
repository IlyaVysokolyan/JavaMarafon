package day11.Hero;

import day11.Hero.Hero;
import day11.Warrior;
import day11.interfaces.MagicAttack;
import day11.interfaces.PhysAttack;

public class Magician extends Hero implements MagicAttack, PhysAttack {

    private double magicDef;
    private int physAtt;
    private int magicAtt;

    public Magician() {
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
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
    public void physicalAttack(Hero hero) {
        if (hero instanceof Warrior)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Warrior) hero).getPhysDef()));
        if (hero instanceof Paladin)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Paladin) hero).getPhysDef()));
        if (hero instanceof Shaman)
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * ((Shaman) hero).getPhysDef()));
        if (hero.getHealth() < getMinHealth()) hero.setHealth(getMinHealth());

    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero instanceof Warrior) hero.setHealth(hero.getHealth() - magicAtt);
        if (hero instanceof Paladin)
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * ((Paladin) hero).getMagicDef()));
        if (hero instanceof Shaman)
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * ((Shaman) hero).getMagicDef()));
        if (hero.getHealth() < getMinHealth()) hero.setHealth(getMinHealth());
    }

    @Override
    public String toString() {
        return "Magician {" + super.toString();
    }
}
