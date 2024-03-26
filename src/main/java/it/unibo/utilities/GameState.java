package it.unibo.utilities;

public enum GameState {
    HOME,

    PLAYING,

    PAUSED,

    GAMEOVER,

    SETTINGS;

    private static GameState gamestate = HOME;

    public static GameState getGameState() {
        return gamestate;
    }

    public static void setGameState(final GameState state) {
        gamestate = state;
    }
}
