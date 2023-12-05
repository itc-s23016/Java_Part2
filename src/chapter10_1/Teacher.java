package chapter10_1;

public class Teacher extends User implements Versionable{
    private String url;

    public Teacher(int id, String name, String url) {
        super(id, name, url);
        this.url = url;
    }

    public String getSubject() {
        return url;
    }

    @Override
    public String version() {
        return "Teacher ver 1.0";
    }
}
