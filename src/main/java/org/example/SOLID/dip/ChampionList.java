package org.example.SOLID.dip;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ChampionList {
    // key --> name을 가지고 해당 객체 생성( Supplier)
    private final Map<String, Supplier<Dip>> champions = new HashMap<>();

    public ChampionList() {
        champions.put("ezreal", Ezreal::new);
        //새로운 챔피언 나오면 여기에만 추가 --> OCP 충족
    }

    public Dip getChampion(String champName) {
        Supplier<Dip> supplier = champions.get(champName);
        if (supplier == null) {
            System.out.println("No such champion: " + champName);
        }
        return supplier.get();
    }

}
