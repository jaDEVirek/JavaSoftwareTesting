package testRX;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class PathSourceNumbs {
    public static void main(String[] args) throws IOException {

        ArrayList<String> listaSlow = new ArrayList<>();
        Arrays.stream(listaSlow.toArray()).limit(10).forEach(System.out::print);

//        System.out.println(Arrays.deepToString(turnFileIntoDataBase(Paths.get(
//                "D:\\Programistyczne\\IdeaProject\\JavaSoftwareTesting\\src\\main\\java\\testRX\\numerki.txt"))));
    }

//   static int[][] turnFileIntoDataBase(Path filePath) throws IOException {
//        //zalecam obsluge try with resources, dla zapewnienia gwarancji odczytu lub blok finally
//        return Files.lines(filePath)
//                .map((fileLine) -> fileLine.trim()
//                        .split(","))
//                .map((eachLineNumbers) -> Stream.of(eachLineNumbers)
//                        .mapToInt(Integer::parseInt)
//                        .toArray())
//                .toArray(int[][]::new);
//    }

}




