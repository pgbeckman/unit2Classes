public class Door {
    public String name;
    public String state;
    public Door(String name1, String state1) {
        name = name1;
        state = state1;
    }
    public String open() {
        state = "open";
        return state;
    }
    public String close() {
        state = "closed";
        return state;
    }
    public String getName() {
        return name;
    }
    public String getState() {
        return state;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setState(String newState) {
        state = newState;
    }
}
