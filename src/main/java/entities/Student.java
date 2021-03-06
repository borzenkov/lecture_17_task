package entities;

/**
 * Created by vic on 24.11.16.
 */
public class Student {

    private String name;
    private String gender;
    private String groupNumber;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String toString() {
        return new StringBuilder()
                .append(name)
                .append(" ")
                .append(gender)
                .append(" ")
                .append(groupNumber)
                .toString();
    }
}
