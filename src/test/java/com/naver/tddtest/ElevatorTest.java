package com.naver.tddtest;

import org.junit.Test;
import static org.junit.Assert.*;


public class ElevatorTest {

    @Test
    public void 엘레베이터는_층과_열림닫힘_상태를_가진다 () {
        Elevator ev = new Elevator();
        assertNotNull(ev.getFloor());
        assertNotNull(ev.getIsOpen());
    }

    @Test void 엘레베이터는_도달목표층이_있음() {
        Elevator ev = new Elevator();
        assertNotNull(ev.getTargetFloor());

    }

    @Test
    public void 엘레베이터를_특정_층에서_누르면_엘레베이터가_도착한다() {
        Elevator ev = new Elevator();
        ev.clickButton(4);
        assertEquals(4, ev.getFloor());

        ev.clickButton(5);
        assertEquals(4, ev.getFloor());
    }

    // 타겟플로어를 설정한 후 층이 그 쪽으로 이동.

    // 층으로 이동하면 문이 열린다.

    // 여러 개 층을 입력한다면 여러 층이 모두 스택에 들어감.

    // 층


}
