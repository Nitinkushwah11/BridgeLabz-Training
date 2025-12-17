public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // 1 km = 0.621371 miles
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                            volumeKm + " and cubic miles is " + volumeMiles);
    }
}
