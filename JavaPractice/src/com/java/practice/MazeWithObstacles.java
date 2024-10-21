package com.java.practice;

public class MazeWithObstacles {

    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},
                            {true, false,true},
                            {true,true,true}};
        mazeWithObstacles(maze,"",0,0);
    }

    private static void mazeWithObstacles(boolean[][] maze, String p, int row, int col) {

        if (row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[row][col]){
            return;
        }

        if (row< maze.length-1){
            mazeWithObstacles(maze,p+"D",row+1,col);
        }
        if (col<maze[0].length-1){
            mazeWithObstacles(maze,p+"R",row,col+1);
        }
    }
}
