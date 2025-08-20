package Programming_Elements;

public class VolumeOfEarth {

	public static void main(String[] args) {
		int radiusInKm=6378;
		double pi =Math.PI;
		double volumeInKm =4.0/3*pi*Math.pow(radiusInKm,3);
		double volumeInMiles =volumeInKm * Math.pow(0.621371,3);
		System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",volumeInKm,volumeInMiles);
	}

}
