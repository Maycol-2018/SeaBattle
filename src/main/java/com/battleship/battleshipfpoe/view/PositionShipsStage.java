package com.battleship.battleshipfpoe.view;

import com.battleship.battleshipfpoe.controller.PositionShipsController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PositionShipsStage extends Stage {
    private PositionShipsController positionShipsController;
    private Parent root;
    public PositionShipsStage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/battleship/battleshipfpoe/position-ships-view.fxml"));
        try{
            root = loader.load();
            positionShipsController = loader.getController();
        } catch (IOException e){
            e.printStackTrace();
        }

        Scene scene = new Scene(root);

        setScene(scene);

        setTitle("Position Ships");
        setResizable(false);

        show();
    }

    private static class PositionShipsHolder{
        private static PositionShipsStage INSTANCE;
    }

    public static PositionShipsStage getInstance(){
        PositionShipsHolder.INSTANCE = PositionShipsHolder.INSTANCE != null ?
                PositionShipsHolder.INSTANCE : new PositionShipsStage();
        return PositionShipsHolder.INSTANCE;
    }

    public static void deletedInstance(){
        PositionShipsHolder.INSTANCE.close();
        PositionShipsHolder.INSTANCE = null;
    }
}
