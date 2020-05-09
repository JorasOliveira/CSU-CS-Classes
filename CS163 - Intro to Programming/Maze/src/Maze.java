import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Maze implements IMaze {




    @Override
    public char[][] readFile(String filename) {

        try {
            char[][] charArray;

            String line;
            Scanner scan = new Scanner(new File(filename));
            charArray = new char[scan.nextInt()][scan.nextInt()];


            scan.nextLine();
            for(int i = 0; i < charArray.length ; i++){

                line = scan.nextLine();

                charArray[i] = line.toCharArray();
            }
            return charArray;

        } catch (FileNotFoundException e) {
            return null;
        }
    }

    @Override
    public int[] findStart(char[][] maze) {

        int[] start = new int[2];

        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[0].length; j++){

                if(maze[i][j] == 'S'){

                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        return start;
    }

    @Override
    public String findPath(char[][] maze, int[] startPosition) {

        int r = startPosition[0];
        int c = startPosition[1];
        if(r < 0 || r > maze.length) {
            return "";
        }
        if(c < 0 || c > maze[0].length) {
            return "";
        }
        else {
            String path = recPath(maze, r, c);
            maze[r][c] = 'S';
            return path;
        }


    }

    private String recPath(char[][] maze, int r, int c) {
        if(r < 0 || c < 0 || r > maze.length || c > maze[0].length) {
            return "";
        }
        if(maze[r][c] == '#' || maze[r][c] == '.') {
            return "";
        }
        if(maze[r][c] == 'G') {
            return "G";
        }
        String path = "";
        maze[r][c] = '.';
        path = recPath(maze, r-1, c);
        if(path != "") {
            return 'U' + path;
        }
        path = recPath(maze, r, c+1);
        if(path != "") {
            return 'R' + path;
        }
        path = recPath(maze, r+1, c);
        if(path != "") {
            return 'D' + path;
        }
        path = recPath(maze, r, c-1);
        if(path != "") {
            return 'L' + path;
        }
        maze[r][c] = ' ';
        return "";

    }


    @Override
    public String printMaze(char[][] maze) {
        String print = "";
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[i].length; j++) {
                print += maze[i][j];
            }
            print += "\n";
        }
        return print;

    }

    public static void main (String [] args) {
        Maze a = new Maze();
        char[][] maze = a.readFile("maze1..txt");
        int[] s = a.findStart(maze);
        System.out.println(a.findPath(maze, s));
        System.out.print(a.printMaze(maze));
    }


}
