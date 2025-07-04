/*
* 고수준 모듈인 픽창에서는 Dip에만 의존 --> Dip에 어떤 챔피언이 들어올지는 모름 -> 추상화에 의존
*
* */

package org.example.SOLID.dip;

public class PickArea {
    private final ChampionList championList;

    public PickArea(ChampionList championList) {
        this.championList = championList;
    }

    public Dip pick(String champName){
        System.out.println("Picking " + champName);
        return championList.getChampion(champName);
    }

}
