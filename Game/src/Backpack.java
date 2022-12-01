import java.util.ArrayList;

//=======рюкзак=======
public class Backpack {
    ArrayList<String> arBackpack = new ArrayList<>();

    public Backpack (ArrayList<String> arBackpack) {
        this.arBackpack = arBackpack;
        arBackpack.add(0,"Лист персонажа");
        arBackpack.add(1, String.valueOf(250));
        arBackpack.add(2, "Скальпель");
        arBackpack.add(3, "Разбавленный спирт 3x0.5");
    }
}
