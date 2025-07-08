package org.example.model;

public class Room {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;


    public Room(Ceiling ceiling, Wall wall4, Wall wall3, Wall wall2, Wall wall1, String name) {
        this.ceiling = ceiling;
        this.wall4 = wall4;
        this.wall3 = wall3;
        this.wall2 = wall2;
        this.wall1 = wall1;
        this.name = name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public String getName() {
        return name;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Wall getWall4() {
        return wall4;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", wall3=" + wall3 +
                ", wall4=" + wall4 +
                ", ceiling=" + ceiling +
                '}';
    }
}
