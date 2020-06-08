package militaryelite;

import militaryelite.interfaces.Mission;
import militaryelite.interfaces.Private;
import militaryelite.interfaces.Soldier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            Map<Integer, Soldier> soldiers = new LinkedHashMap<>();
            Map<Integer, Private> privates = new LinkedHashMap<>();

            var input = bfr.readLine();
            while (!input.equals("End")) {
                var tokens = input.split("\\s+");
                switch (tokens[0]) {


                    case "Private": {
                        var priv = new PrivateImpl(
                                Integer.parseInt(tokens[1]),
                                tokens[2],
                                tokens[3],
                                Double.parseDouble(tokens[4]));
                        soldiers.putIfAbsent(priv.getId(), priv);
                        privates.putIfAbsent(priv.getId(), priv);
                        break;
                    }

                    case "LeutenantGeneral":
                    case "LieutenantGeneral": {
                        var lieutenant = new LieutenantGeneralImpl(
                                Integer.parseInt(tokens[1]),
                                tokens[2],
                                tokens[3],
                                Double.parseDouble(tokens[4]));
                        for (int i = 5; i < tokens.length; i++) {
                            int id = Integer.parseInt(tokens[i]);
                            if (privates.containsKey(id)) {
                                lieutenant.addPrivate(privates.get(Integer.parseInt(tokens[i])));
                            }
                        }

                        soldiers.putIfAbsent(lieutenant.getId(), lieutenant);
                        break;
                    }

                    case "Engineer": {
                        try {
                            var engineer = new EngineerImpl(
                                    Integer.parseInt(tokens[1]),
                                    tokens[2],
                                    tokens[3],
                                    Double.parseDouble(tokens[4]),
                                    Corps.valueOf(tokens[5].toUpperCase()));
                            for (int i = 6; i < tokens.length - 1; i += 2) {
                                engineer.addRepair(
                                        new RepairImpl(tokens[i], Integer.parseInt(tokens[i + 1])));
                            }

                            soldiers.putIfAbsent(engineer.getId(), engineer);
                        } catch (IllegalArgumentException e) {
                        }

                        break;
                    }

                    case "Commando": {
                        try {
                            var commando = new CommandoImpl(
                                    Integer.parseInt(tokens[1]),
                                    tokens[2],
                                    tokens[3],
                                    Double.parseDouble(tokens[4]),
                                    Corps.valueOf(tokens[5].toUpperCase()));
                            for (int i = 6; i < tokens.length - 1; i += 2) {

                                if ((i + 1) < tokens.length && MissionImpl.validMissionName(tokens[i + 1])) {
                                    commando.addMission(
                                            new MissionImpl(
                                                    tokens[i],
                                                    MissionState.valueOf(tokens[i + 1].toUpperCase())));
                                }
                            }
                            soldiers.putIfAbsent(commando.getId(), commando);

                        } catch (IllegalArgumentException e) {
                        }
                        break;
                    }

                    case "Spy": {
                        var spy = new SpyImpl(
                                Integer.parseInt(tokens[1]),
                                tokens[2],
                                tokens[3],
                                tokens[4]);
                        soldiers.putIfAbsent(spy.getId(), spy);
                        break;
                    }
                }

                input = bfr.readLine();
            }

            for (Soldier soldier : soldiers.values()) {
                System.out.println(soldier);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
