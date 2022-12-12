package Sensores;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class Sensor {
	public int sensorUmidade;
	public int sensorTemperatura;
	public int sensorCO2;


	public void sensorUmidade(){
		Integer[] vet; 
	Random random = new Random();
	Date date = new Date();
	vet = new Integer [48];
	
	for(int i=0; i<vet.length; i++){
		vet[i] = random.nextInt(100);
		
	}
	
	Arrays.sort(vet, Collections.reverseOrder());
	
	System.out.println("---Umidade relativa do ar---");
	
	for(int j=0; j< vet.length; j++) {
		
		date = new Date(date.getTime()+ 30*60*1000);
		System.out.printf("Umidade: " + vet[j]+ " por cento.");
		System.out.printf(" - Data/Hora: " + date);
		System.out.println("");
		
		
	}
	}



public void sensorTemperatura() {
	
	int[] vet; 
	Random random = new Random();
	Date date = new Date();
	vet = new int [48];
	
	for(int i=0; i<vet.length; i++){
		vet[i] = random.nextInt(60);
	}
	
	Arrays.sort(vet);
	
	System.out.println("---Temperatura---");
	
	for(int j=0; j< vet.length; j++) {
		date = new Date(date.getTime()+ 30*60*1000);
        System.out.printf("Temperatura: " + vet[j] + "ºC");
        System.out.printf(" - Data/Hora: " + date);
        System.out.println("");
        
        
	}		
}



public void sensorCO2(){
	int[] vet; 
Random random = new Random();
Date date = new Date();
vet = new int [48];

for(int i=0; i<vet.length; i++){
	vet[i] = random.nextInt(1000);
}

Arrays.sort(vet);

System.out.println("---Nível de CO2---");

for(int j=0; j< vet.length; j++) {
	date = new Date(date.getTime()+ 30*60*1000);
	System.out.printf("CO2: " + vet[j] + "ppm");
	System.out.printf(" - Data/Hora: " + date);
	System.out.println("");
	
	
}

}

}
