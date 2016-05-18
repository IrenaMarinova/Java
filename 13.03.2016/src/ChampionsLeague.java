import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class ChampionsLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TreeMap<String, Integer> wins = new TreeMap<>();
        TreeMap<String, TreeSet<String>> oponents = new TreeMap<String, TreeSet<String>>();
        while (!input.equals("stop")){
            String [] line = input.split(" \\| ");
            String team1 = line[0];
            String team2 = line[1];
            String [] result1 = line[2].split("\\:");
            String [] result2 = line[3].split("\\:");
            TreeSet<String> oponentsSet = oponents.get(line[1]);
            if (oponentsSet == null) {
                oponentsSet = new TreeSet<>();
            }
            oponentsSet.add(line[1]);
            oponents.put(line[0], oponentsSet);

            Integer oldWins1 = wins.get(line[0]);
            if (oldWins1==null){
                oldWins1=0;
            }
            Integer oldWins2 = wins.get(line[1]);
            if (oldWins2==null){
                oldWins2=0;
            }

            int goals1 = Integer.parseInt(result1[0]) + Integer.parseInt(result2[1]);
            if (!result2[1].equals("0")){
                goals1++;
            }
            int goals2 = Integer.parseInt(result1[1]) + Integer.parseInt(result2[0]);
            if (!result1[1].equals("0")){
                goals2++;
            }
            if (goals1>goals2){
                wins.put(line[0], oldWins1+1);
                wins.put(line[1], oldWins2);
            }else{
                wins.put(line[0], oldWins1);
                wins.put(line[1], oldWins2+1);
            }


            input = sc.nextLine();
        }
        wins.keySet().stream().forEach(e -> System.out.println(e));
//        wins.values().stream().sorted((e1, e2) -> Integer.compare(e2.intValue(),
//                e1.intValue())).forEach(e -> System.out.printf("%s\n- Wins: %d", wins.get(e).toString(), e));
//        wins.descendingMap();
        System.out.println(oponents);
    }

}
