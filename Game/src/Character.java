//=======персонаж=======

public class Character {
    public int Level;
    public int Respect;
    public String name;

    public Character(String name) {
        Level = 1;
        Respect = 0;
        this.name = name;
    }
}