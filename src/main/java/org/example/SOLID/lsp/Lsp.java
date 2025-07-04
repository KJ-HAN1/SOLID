/*
 *   하위 구현체가 어떤게 오더라도 상위 구현체의 getMmr()은 예상대로 문제 없이 동작해야함!
 *   --> 하위구현체에 상위구현체를 대체해서 작성해도 동작해야함
 *
 */

package org.example.SOLID.lsp;

public interface Lsp {
    double getMmr(String userName);
}
