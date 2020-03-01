public class Demerging {
    private String name;
    private String sex;
    private String date;


    public Demerging() {
    }

    public Demerging(String name, String sex, String date) {
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}