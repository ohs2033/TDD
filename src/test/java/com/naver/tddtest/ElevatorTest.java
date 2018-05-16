package com.naver.tddtest;

import org.junit.Test;

import static java.lang.Thread.sleep;
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
    public void 타겟층을_설정한후_그_층으로_이동() throws Exception {
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

    @Test
    public void 문을_열고_닫을수_있어야_함() {
        Elevator ev = new Elevator();
        ev.setIsOpen(true);
        assertEquals(true, ev.getIsOpen());

        ev.setIsOpen(false);
        assertEquals(false, ev.getIsOpen());
    }

    //이동하기 전에는 문이 닫혀야 함.
    @Test(expected = Exception.class)
    public void 이동하기_전에_문이_닫혀야_함() throws Exception {
        Elevator ev = new Elevator();

        ev.setIsOpen(true);
        ev.clickButton(10);
        ev.moveToTarget();

    }

    @Test
    public void 이동한_후에는_문이_열려야_함() throws Exception {
        Elevator ev = new Elevator();

        assertEquals(false, ev.getIsOpen());

        ev.clickButton(10);
        ev.moveToTarget();

        assertEquals(true, ev.getIsOpen());
    }


    @Test
    public void 일정_시간이_지나면_문이_닫혀야_함() throws Exception {
        Elevator ev = new Elevator();

        ev.setIsOpen(true);
        assertEquals(true, ev.getIsOpen());
        sleep(1000);
        assertEquals(false,ev.getIsOpen());

    }


    // 일정 시간이 지나면 문이 닫혀야 함.


    // 여러 개 층을 입력한다면 여러 층이 모두 스택에 들어감.

    // 층


}
