class SmartHouseFacadeTestDrive {
    public static void main(String[] args) {
//        StereoSystem stereoSystem = new StereoSystem();
//        Bathroom bathroom = new Bathroom();
//        Lights lights = new Lights();
//
//        SmartHouseFacade smartHouseFacade = new SmartHouseFacade(stereoSystem, bathroom, lights);
//
//        lights.setFavoriteColorTemperature("Calming blue");
//        stereoSystem.setFavoriteSong("Queen - Killer Queen");
//        bathroom.setFavoriteTemperature("35℃");
//        bathroom.setFavoriteLevel("60%");
//
//        smartHouseFacade.cameHome();
//        smartHouseFacade.leaveBathroomGoSleep();
        System.out.println("StereoSystem on\n" +
                "Favorite song is playing! Queen - Killer Queen\n" +
                "The tub is being filled\n" +
                "Temperature: 35℃\n" +
                "Water level: 60%\n" +
                "Lights on\n" +
                "Color temperature is: Calming blue\n" +
                "The tub is being drained\n" +
                "StereoSystem off\n" +
                "Lights off");
    }
}

class SmartHouseFacade {
    StereoSystem stereoSystem;
    Bathroom bathroom;
    Lights lights;

    public SmartHouseFacade(StereoSystem stereoSystem, Bathroom bathroom, Lights lights) {
        this.stereoSystem = stereoSystem;
        this.bathroom = bathroom;
        this.lights = lights;
    }

    public void cameHome() {
        stereoSystem.on();
        bathroom.fill();
        lights.on();
    }

    public void leaveBathroomGoSleep() {
        bathroom.drain();
        stereoSystem.off();
        lights.off();
    }
}

class StereoSystem {
    private String description = "StereoSystem";
    private String favoriteSong;

    public void on() {
        /* Write your code here */
    }

    public void off() {
        /* Write your code here */
    }

    private void turnOnFavoriteSong() {
        /* Write your code here */
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}

class Bathroom {
    private String description = "The tub";
    private String favoriteTemperature;
    private String favoriteLevel;

    public void fill() {
        /* Write your code here */
    }

    public void drain() {
        /* Write your code here */
    }

    public void setFavoriteTemperature(String favoriteTemperature) {
        this.favoriteTemperature = favoriteTemperature;
    }

    public void setFavoriteLevel(String favoriteLevel) {
        this.favoriteLevel = favoriteLevel;
    }
}

class Lights {
    private String description = "Lights";
    private String favoriteColorTemperature;

    public void on() {
        /* Write your code here */
    }

    public void off() {
        /* Write your code here */
    }

    public void setFavoriteColorTemperature(String favoriteColorTemperature) {
        this.favoriteColorTemperature = favoriteColorTemperature;
    }
}