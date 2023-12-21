package org.example;

public abstract class AbstractEntity {

    private int id;
    private static int nextId = 1;

    public AbstractEntity() {
        this.id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }
}
