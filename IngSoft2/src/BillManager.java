
public class BillManager {
	double rideCost;
	SensorManager sensormanager;
	double finalDiscountorFee;
public void calculateCharge(double timeOfDrive, boolean powerGridSensor,boolean passengerSensor, boolean batterySensor,boolean tooMuchDistanceFromPowerGrid){
	double temp=timeOfDrive; 
		if (passengerSensor!=false){
			temp=timeOfDrive;
			temp=temp-temp*0.1;
		}
		if (batterySensor!=false){
			temp=timeOfDrive;
			temp=temp-temp*0.2;
		}
		if (powerGridSensor!=false){
			temp=timeOfDrive;
			temp=temp-temp*0.3;
		}
		
		if (tooMuchDistanceFromPowerGrid!=false){
			temp=timeOfDrive;
			temp=temp+temp*0.3;
		}
		this.rideCost=temp;
		this.finalDiscountorFee=timeOfDrive-temp;		
	}
}
