import java.util.Random;

public class Main {
    enum Player {
        USER("Пользователь"),
        COMPUTER("Компьютер"),
        NONE("Не определен");
        String value;

        Player(String value) {
            this.value = value;
        }
    }

    enum Board {
        WHITE,
        BLACK;
    }

    enum Checker {
        WHITE,
        BLACK,
        NONE
        ;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int boardSize = 8; // шахматное поле 8х8 квадратиков
        int computers = 12; // у каждого игрока по 12 шашек
        int players = 12;

        Player activePlayer = Player.NONE;

        Board[][] board = new Board[boardSize][boardSize]; //заполняем клеточки в шахматном порядке
        for (int i = 0; i < boardSize; i++) { // i по ширине, j по высоте
            for (int j = 0; j < boardSize; j++) {
                if (i % 2 == 0 & j % 2 == 0) {
                    board[i][j] = Board.BLACK;
                } else if (i % 2 != 0 & j % 2 != 0) {
                    board[i][j] = Board.BLACK;
                }
                if (board[i][j] != Board.BLACK) board[i][j] = Board.WHITE;
            }
        }

        Checker[][] playersCHECKERS = new Checker[boardSize][3]; // шашки игрока - белые
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < 3; j++) {  // первые три ряда шахматного поля, i - столбец, j - ряд
                if (board[i][j] == Board.BLACK) { // если клетка черная, там стоит белая шашка
                    playersCHECKERS[i][j] = Checker.WHITE;
                }
            }
        }

        Checker[][] computersCHECKERS = new Checker[boardSize][boardSize]; // шашки компьютера - черные
        for (int i = 0; i < boardSize; i++) { // последние три ряда шахматного поля, i - столбец, j - ряд
            for (int j = 5; j < boardSize; j++) { // шашки компьютера расп. с 5 по 7 ряд
                if (board[i][j] == Board.WHITE) {
                    computersCHECKERS[i][j] = Checker.BLACK; // если клетка белая, там стоит черная шашка
                }
            }
        }

        boolean WhosFirst = random.nextBoolean();
        if (!WhosFirst) {

        }

    }
}