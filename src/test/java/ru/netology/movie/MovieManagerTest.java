package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void addMovie() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Отель Белград");

        String[] expected = {"Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sevenAddMovie() {
        MovieManager manager = new MovieManager();


        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");


        String[] expected = {"Отель Белград", "Джентельмены", "Человек невидимка", "Тролли.Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек невидимка", "Джентельмены", "Отель Белград",};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fourAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек невидимка");
        manager.addMovie("Тролли.Мировой тур");

        String[] expected = {"Отель Белград", "Джентельмены", "Человек невидимка", "Тролли.Мировой тур"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void fourfindLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек невидимка");
        manager.addMovie("Тролли.Мировой тур");

        String[] expected = {"Тролли.Мировой тур", "Человек невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sixfindLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
