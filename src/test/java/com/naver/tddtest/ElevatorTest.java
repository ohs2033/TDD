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

    @Test
    public void 엘레베이터는_도달목표층이_있음() {
        Elevator ev = new Elevator();
        assertNotNull(ev.getTargetFloor());

    }

    @Test
    public void 엘레베이터를_특정_층에서_누르면_엘레베이터_목표층이_설정됨() {
        Elevator ev = new Elevator();
        ev.clickButton(4);
        assertEquals(4, ev.getTargetFloor());

        ev.clickButton(5);
        assertEquals(5, ev.getTargetFloor());
    }

    @Test
    public void 타겟층을_설정한후_그_층으로_이동() {
        Elevator ev = new Elevator();

        ev.clickButton(4);
        assertEquals(4, ev.getTargetFloor());
        ev.moveToTarget();
        assertEquals(4, ev.getFloor());


        // 삼각측량.
        ev.clickButton(10);
        assertEquals(10, ev.getTargetFloor());

        assertNotEquals(10, ev.getFloor());
        ev.moveToTarget();
        assertEquals(10, ev.getFloor());
    }

    //이동하기 전에는 문이 닫혀야 함.
    @Test(expected = Exception.class)
    public void 이동하기_전에_문이_닫혀야_함() {

    }

    // 층으로 이동하면 문이 열린다.

    // 여러 개 층을 입력한다면 여러 층이 모두 스택에 들어감.

    // 층


}
