public class Player {

    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isWhite() {
        return white;
    }

    public int getRank() {
        return rank;
    }

    public int getAge() {
        return age;
    }



public Player (String name, String email, boolean white, int rank, int age) {
    this.name = name;
    this.email = email;
    this.white = white;
    this.rank = rank;
    this.age = age;
}

    @Override
    public String toString() {
        return "Chess Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
