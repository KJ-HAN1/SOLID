package org.example.SOLID.v1.lsp;

public class GeneralGame implements Lsp{

//    DB가 있다면 해당 DB에서 유저의 mmr을 가지고 와서 사용
    private final int point = 1000;
    double mmr;

    GeneralGame(){
        this.mmr = point;
    }

    public void win(){
        mmr = point+(point*0.02);
    }
    public void lose(){
        mmr = point+(point*0.02);
    }

    @Override
    public double getMmr(String userName) {
        return mmr;
    }
}
