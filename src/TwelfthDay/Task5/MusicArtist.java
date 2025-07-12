package TwelfthDay.Task5;

public class MusicArtist {
    String name;
    int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist [name=" + name + ", age=" + age + "]";
    }
}
