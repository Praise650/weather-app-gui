import javax.swing.*;

class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                // display our weather app gui
                new WeatherAppGui().setVisible(true);

               // System.out.println(WeatherApp.getLocationData("Akure"));

               // System.out.println(WeatherApp.getCurrentTime());

            }
        });
    }
}
