import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        String[] ip = new String[inputs];
        String[] names = new String[inputs];
        String[] duration = new String[inputs];
        String nextInput = sc.nextLine();
        for (int i = 0; i < inputs; i++) {
            nextInput = sc.nextLine();
            Pattern digit = Pattern.compile("(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})\\s([a-z]+)\\s([0-9]+)");
            Matcher match = digit.matcher(nextInput);
            while (match.find()) {
                ip[i] = (match.group(1));
                names[i] = (match.group(2));
                duration[i] = (match.group(3));
            }
        }
        //Set<String> ipList = new TreeSet<String>();
        TreeMap<String, Integer> durationList = new TreeMap<>();
        HashMap<String, TreeSet<String>> output = new HashMap<>();
        for (int i = 0; i < inputs; i++) {
            Integer oldDuration = durationList.get(names[i]);
            if (oldDuration == null) {
                oldDuration = 0;
            }
            durationList.put(names[i], oldDuration + Integer.parseInt(duration[i]));
            TreeSet<String> ipSet = output.get(names[i]);
            if (ipSet == null) {
                ipSet = new TreeSet<>();
            }
            ipSet.add(ip[i]);
            output.put(names[i], ipSet);
        }
        for (Map.Entry<String, Integer> userAndDuration : durationList.entrySet()) {
            String user = userAndDuration.getKey();
            int dur = userAndDuration.getValue();
            TreeSet<String> ipSet = output.get(user);
            System.out.println(user + ": " + dur + " " + ipSet);
        }
    }
}
//        int counter = 0;
//        String previous = "";
//        for (String name : names) {
//            if (name.equals(previous)) {
//                counter++;
//            } else {
//                counter = 1;
//            }
//            //output.put(name, new ArrayList<>(Arrays.asList(ip[0])));
//            if (counter >= 2) {
//                output.get(names[counter - 1]).add(ip[counter - 1]);
//            }
//
//            previous = names[counter-1];
//        }
//        for (String s : output.keySet()) {
//            System.out.println("" + s + " -> " + output.get(s));
//            System.out.println(durationList);
//        }
//    }
//}
//        output.put(names[0], new ArrayList<>(Arrays.asList(ip[0])));
//            for (int i = 1; i <names.length-1 ; i++) {
//                if (names[i].equals(names[0])){
//                    output.get(names[0]).add(ip[i]);
//                    durationList.add(Integer.parseInt(duration[i]));
//                }else{
//                    if (output.containsKey(names[i])){
//                       // for (int j = i+1; j < names.length; j++) {
//                            if (names[i+1].equals(names[i])) {
//                                output.get(names[i]).add(ip[i+1]);
//                                //durationList.add(Integer.parseInt(duration[i]));
//                            }
//                       // }
//                    }else {
//                        output.put(names[i], new ArrayList<>(Arrays.asList(ip[i])));
////                        for (int j = i+1; j < names.length; j++) {
////                            if (names[j].equals(names[i])) {
////                                output.get(names[i]).add(ip[j]);
////                            }
////                        }
//
//                    }
//                }
//            }








