package edu.kis.vh.nursery;

/**
 * HanoiRhymer to specjalny wariant wyliczanki, który uniemożliwia
 * dodanie liczby większej niż obecnie znajdująca się na szczycie.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
    /**
     * Licznik elementów, które zostały odrzucone z powodu
     * przekroczenia wartości bieżącego elementu.
     */
    int totalRejected = 0;

    /**
     * Zwraca łączną liczbę odrzuconych elementów.
     * @return liczba odrzuconych elementów.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje nową wartość do wyliczanki. Jeśli wartość jest większa
     * od bieżącej i wyliczanka nie jest pusta, element zostaje odrzucony.
     * @param in wartość do dodania.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
