public class Main {
    public static void main(String[] args) {
        Pokemon Bulbasaur = new Pokemon("Bulbasaur", "Grass", "Poison", "Overgrow", 10,
                new BaseStats(45, 49, 49, 65, 65, 45));
        System.out.println(Bulbasaur);
    }
}