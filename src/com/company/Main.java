package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        Path path = Paths.get("Input.txt");

        // Читаем коллекцию из файла в lines
        try (Stream<String> lineStream = Files.lines(path)) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException ignored) {
        }

        // Выводим каждый уникальный элемент lines
        lines.stream().distinct().forEach(x -> System.out.println(x));

    }
}
