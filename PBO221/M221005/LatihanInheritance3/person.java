package PBO221.M221005.LatihanInheritance3;

import java.lang.reflect.Constructor;

public class person {
    String id, name, address;

    // Constructor
    public person(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
