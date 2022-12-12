import Sensores.*;

public class App{
    public static void main (String[] args) throws Exception{
    Sensor grupoSensores= new Sensor();
            grupoSensores.sensorUmidade();
            grupoSensores.sensorTemperatura();
            grupoSensores.sensorCO2();
    
}}