package com.example.cleancode.chapter_ten;

public class PrimePrinter {

    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 1000;
        int[] primes = PrimeGenerator.generate(NUMBER_OF_PRIMES);

        final int ROWS_PER_PAGE = 50;
        final int COLUMNS_PER_PAGE = 4;
        RowColumnPagePrinter tablePringter =
                new RowColumnPagePrinter(ROWS_PER_PAGE,
                        COLUMNS_PER_PAGE,
                        "The First" + NUMBER_OF_PRIMES + "Prime Nubers");
        tablePringter.print(primes);
    }
}
