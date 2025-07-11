/*
 *   롤 mmr 을 가지고 LSP 구현
 *   현재 유저의 닉네임을 통해 랭크/일반게임 승리/패배시 mmr의 변동사항을 check 가능
 *   DB는 따로 작성을 안했기 때문에 임시로 1000점을 기준으로 일반/랭크 승패 점수 계산
 *   Lsp 인터페이스의를 구현한 구현체의 rankgame, generalgame 에서도 상위객체(lsp)로 변환했을때도 getMmr이 정상적으로 잘 동작
 */

package org.example.SOLID.v1.lsp;

public class main {
    public static void main(String[] args) {
        //상위객체로 generalGame, Rankgame 갈아끼우기 test
    Lsp game = new GeneralGame();
    Lsp game2 = new RankGame();
    RankGame game3 = new RankGame();

    // Lsp의 getMmr 정상 동작
        System.out.println(game.getMmr("user1"));
        System.out.println(game2.getMmr("user1"));

        game3.win();
        System.out.println(game3.getMmr("user1"));
    }
}
