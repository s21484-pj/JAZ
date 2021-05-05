package pl.pjatk.maclec.model;

public class POJO {

    private final int id;
    private final String anyString;

    public POJO(int id, String anyString) {
        this.id = id;
        this.anyString = anyString;
    }

    public int getId() {
        return id;
    }

    public String getAnyString() {
        return anyString;
    }

    public void printOutMe() {
        System.out.println(anyString);
    }

    @Override
    public String toString() {
        return "POJO{" +
                "id=" + id +
                ", anyString='" + anyString + '\'' +
                '}';
    }
}
