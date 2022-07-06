public class ChessMain {
    public static void main(String[] args) {

Player whitePlayer = new Player("Beth Harmon", "bethharmon@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Vasily Borgov", "vborgov@gmail.com", false, 2500, 36);
//
//        System.out.println("The player 1 is: " + whitePlayer.getName() + ", Email: " + whitePlayer.getEmail() + ", Rank: " + whitePlayer.getRank() + ", Age: " + whitePlayer.getAge());
//        System.out.println("The player 2 is: " + blackPlayer.getName() + ", Email: " + blackPlayer.getEmail() + ", Rank: " + blackPlayer.getRank() + ", Age: " + blackPlayer.getAge());

        System.out.println(whitePlayer); //toString
        System.out.println(blackPlayer);
    }



}
























