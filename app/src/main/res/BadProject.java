/**
 * Created by Daniel on 4/15/2015.
 */
public class Project {
    private int id;
    private String name;
    private double price;

    public Project(){
        super();
    }

    public Project(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.name;
    }
}
