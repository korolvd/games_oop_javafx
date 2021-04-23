package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BishopBlackTest {

    @Test
    public void isPosition() {
        Figure figure = new BishopBlack(Cell.A1);
        assertThat(figure.position(), is(Cell.A1));
    }

    @Test
    public void wayIsCorrect() throws ImpossibleMoveException {
        Figure figure = new BishopBlack(Cell.A4);
        Cell[] extended = new Cell[] {
                Cell.B5,
                Cell.C6,
                Cell.D7,
                Cell.E8
        };
        assertThat(figure.way(Cell.E8), is(extended));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayIsNotCorrect() throws ImpossibleMoveException {
        Figure figure = new BishopBlack(Cell.A4);
        figure.way(Cell.E7);
    }

    @Test
    public void isCopy() {
        Figure figure = new BishopBlack(Cell.A1);
        assertThat(figure.copy(Cell.A2).position(), is(Cell.A2));
    }

    @Test
    public void testWay() {
    }
}