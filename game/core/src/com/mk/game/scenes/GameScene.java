package com.mk.game.scenes;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.mk.game.GameManager;
import com.mk.game.MyGame;

public class GameScene implements Screen{

    private MyGame gameObject;
    private World world;
    private GameManager gameManager;

    public GameScene(MyGame gameObject){
        this.gameObject = gameObject;
        this.gameManager = new GameManager();
        this.world = new World(new Vector2(0,0), true);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
