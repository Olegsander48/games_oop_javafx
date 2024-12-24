package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {
    @Test
    public void whenTestPosition() {
        Cell cell = Cell.C3;
        BishopBlack bishopBlack = new BishopBlack(cell);
        assertThat(cell).isEqualTo(bishopBlack.position());
    }

    @Test
    public void whenTestCopy() {
        Cell cell = Cell.C3;
        BishopBlack bishopBlack = new BishopBlack(cell);
        Figure figure = bishopBlack.copy(cell);
        assertThat(bishopBlack.position()).isEqualTo(figure.position());
    }

    @Test
    public void whenTestWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] bishopWay = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5)).isEqualTo(bishopWay);
    }

    @Test
    public void whenTestAnotherWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B5);
        Cell[] bishopWay = {Cell.C6, Cell.D7};
        assertThat(bishopBlack.way(Cell.D7)).isEqualTo(bishopWay);
    }

    @Test
    public void whenIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.isDiagonal(Cell.B7, Cell.H1)).isTrue();
    }

    @Test
    public void whenNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.isDiagonal(Cell.B7, Cell.H2)).isFalse();
    }
}