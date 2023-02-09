package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Такая-то ошибка -" + e);
        } catch (IOException e) {
            System.out.println("Такая-то ошибка -" + e);
        } catch (Exception e) {
            System.out.println("Такая-то ошибка -" + e);
        }
    }
}