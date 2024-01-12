package at.is.game;

import org.newdawn.slick.*;
import org.newdawn.slick.tiled.TiledMap;


public class EasyGame extends BasicGame {
    Font font;

    public EasyGame(String title) {
        super(title);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new EasyGame("EasyGame"));
            container.setDisplayMode(1024,768,false);
            container.setMinimumLogicUpdateInterval(25);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    /**
     * Create a new image rendering test
     */

    public void init(GameContainer container) throws SlickException {


    }




    public void update(GameContainer container, int delta) {
        Input input = container.getInput();
        // Fenster mit ESC schließen
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            container.exit();
        }

    }


    public void render(GameContainer container, Graphics g) {
    }

}