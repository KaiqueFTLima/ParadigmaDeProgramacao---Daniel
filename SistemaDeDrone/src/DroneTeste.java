public class DroneTeste {

        public static void main(String[] args) {

            Drone drone1 = new Drone("001", 0, 80, false);

            drone1.decolar();
            drone1.subir(20);
            drone1.descer(5);
            System.out.println(drone1);

        }
}
