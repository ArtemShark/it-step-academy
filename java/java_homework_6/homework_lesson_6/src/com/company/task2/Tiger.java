package com.company.task2;

public class Tiger extends Animal {
    private int stripesCount;

    public Tiger(String name, String habitat, int stripesCount) {
        super(name, habitat);
        this.stripesCount = stripesCount;
    }

    public int getStripesCount() {
        return stripesCount;
    }

    public void setStripesCount(int stripesCount) {
        this.stripesCount = stripesCount;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("У меня " + stripesCount + " полос.");
    }
}

