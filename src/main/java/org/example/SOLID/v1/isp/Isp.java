/*
 *  인터페이스는 구현체에게 작성된 모든 기능을 구현하도록 강제
 *  예시로 미드는 점화, 정글은 강타, 원딜은 힐만 사용한다 가정
 *  아래처럼 구현되어 있으면 어느 라인을 하던 점화,강타, 힐 모두 구현하여야함
 *  인터페이스를 역할군이 필수로 필요한것으로 분리 구성
 */


package org.example.SOLID.v1.isp;

//ex 1)
public interface Isp {
    void attack();
    void ignite();
    void smite();
    void heal();
}
