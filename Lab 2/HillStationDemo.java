class HillStations {
   
    void location() {
        System.out.println("Location of Hill Station.");
    }

    
    void famousFor() {
        System.out.println("Famous for its scenic beauty.");
    }
}


class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for adventure sports and snow-capped mountains.");
    }
}


class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for waterfalls and colonial heritage.");
    }
}


class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for skiing and beautiful landscapes.");
    }
}


public class HillStationDemo {
    public static void main(String[] args) {

        HillStations hill;

        hill = new Manali();
        hill.location();
        hill.famousFor();

        hill = new Mussoorie();
        hill.location();
        hill.famousFor();

        hill = new Gulmarg();
        hill.location();
        hill.famousFor();

        System.out.println("--------------------------------");

        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}
