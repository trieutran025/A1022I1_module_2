package ss16_io_text_file.exercise.read_file_csv;

public class Country {
    private int id;
    private String Code;
    private String name;

    public Country() {
    }

    public Country(int id, String code, String name) {
        this.id = id;
        Code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", Code='" + Code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
