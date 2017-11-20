package de.tum.cs.i1.pse.observers;
import java.awt.Point;
import java.util.Observable;

import de.tum.cs.i1.pse.model.TemperatureModel;

public class KelvinGUI extends TemperatureGUI{
    private TemperatureModel temperatureModel;
    private Point point;
    public KelvinGUI(TemperatureModel temperatureModel, Point point) {
        super("Kelvin", temperatureModel,point);
        this.temperatureModel=temperatureModel;
        this.point = point;
        setDisplay("" + temperatureModel.getK());
    }
    public double getDisplay(){
        return temperatureModel.getK();
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
