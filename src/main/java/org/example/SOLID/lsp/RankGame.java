package org.example.SOLID.lsp;

public class RankGame implements Lsp{
    private final int point = 1000;
    double mmr;

    RankGame() {
        this.mmr = point;
    }

    public void win(){
        mmr = point+(point*0.05);
    }
    public void lose(){
        mmr = point+(point*0.05);
    }

    @Override
    public double getMmr(String userName) {
        return mmr;
    }
}
