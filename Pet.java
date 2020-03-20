/**
 * The Pet class - a start of the Pet Inheritance Hierarchy
 */
public abstract class Pet {
    // fields
    private String name;

    // constructors
    public Pet() {
        name = "default pet";
    }

    public Pet(String n) {
        name = n;
    }

    // methods
    public String getName() {
        return name;
    }

    public abstract String speak();

    public abstract String walk();

}
