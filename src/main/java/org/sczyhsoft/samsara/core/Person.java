package org.sczyhsoft.samsara.core;

/**
 * WARNING:only for test
 * will vanish in alpha
 */
public class Person implements BaseBean {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
