import javax.swing.*;

/***********************************************
 *@author                     Timothy Lanfranco*
 *@version                                  2.2*
 *@since                               12/05/19*
 ***********************************************/

public class Converter {
    public static void main(String[] args) {
        PROGRAM();
    }

    private static void ReDo() {
        int reply = JOptionPane.showConfirmDialog(null, "Would you like to Convert again?", "Go again?", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            PROGRAM();
        }
        else {
            System.exit(0);
        }
    }

    private static void PROGRAM() {
        int chooseConverter = Integer.parseInt(JOptionPane.showInputDialog(null, "Which converter do you need? \n\n1. Weight\n2. Distance\n3. Temperature\n4. Time"));
        switch (chooseConverter) {
            case 1:
                convertWeight(); break;
            case 2:
                convertDistance(); break;
            case 3:
                convertTemperature(); break;
            case 4:
                convertTime(); break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");  ReDo();
                break;
        }
    }


    private static void convertWeight() {
        final double conversionValue = 2.205;

        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. KG to pounds\n2. Pounds to KG"));

        double enterValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a Value"));

        double res;

        switch (choice) {
            case 1:
                res = enterValue * conversionValue;
                JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                ReDo();
                break;
            case 2:
                res = enterValue / conversionValue;
                JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                ReDo();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");
                ReDo();
                break;
        }
    }

    private static void convertDistance() {
        int choice1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Centimeters to...\n2.Inches to...\n3.Meters to...\n4.Feet to...\n5. Miles to..."));
        int choice2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Centimeters\n2. Inches\n3. Meters\n4. Feet\n5. Miles"));
        double enterValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a Value"));
        double res;
        if (choice1 == 1) { //centimeters
            switch (choice2) {
                case 1:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue / 2.54;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue / 100;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue / 30.48;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 160934.4;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 2) { // inches
            switch (choice2) {
                case 1:
                    res = enterValue * 2.54;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue / 39.37;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue / 12;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 63360;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 3) { //meters
            switch (choice2) {
                case 1:
                    res = enterValue * 30.48;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 39.37;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue * 3.281;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 1609.344;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 4) { //feet
            switch (choice2) {
                case 1:
                    res = enterValue * 30.48;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 12;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue / 3.281;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 5280;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 5) { //miles
            switch (choice2) {
                case 1:
                    res = enterValue * 160934.4;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 63360;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue * 1609.344;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue * 5280;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Option");
            ReDo();
        }
    }

    private static void convertTemperature() {
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius"));
        double enterValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a Value"));
        double CtF = (enterValue * 9/5) + 32;
        double FtC = (enterValue - 32) * 5/9;
        switch (choice) {
            case 1:
                JOptionPane.showMessageDialog(null, String.format("Result is %.3f", CtF));
                ReDo();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, String.format("Result is %.3f", FtC));
                ReDo();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");
                ReDo();
                break;
        }
    }

    private static void convertTime() {
        int choice1 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Seconds to...\n2. Minutes to...\n3. Hours to...\n4. Days to...\n5. Weeks to...\n6. Months to...\n7. Years to..."));
        int choice2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Seconds\n2. Minutes\n3. Hours\n4. Days\n5. Weeks\n6. Months\n7. Years"));
        double enterValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a Value"));
        double res;
        if (choice1 == 1) {
            switch (choice2) {
                case 1:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue / 60;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue / 3600;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue / 86400;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 604800;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 6:
                    res = enterValue / 2.628e+6;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 7:
                    res = enterValue / 3.154e+7;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 2) {
            switch (choice2) {
                case 1:
                    res = enterValue * 60;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue / 60;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue / 1440;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 10080;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 6:
                    res = enterValue / 43800.048;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 7:
                    res = enterValue / 525600;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 3) {
            switch (choice2) {
                case 1:
                    res = enterValue * 3600;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 60;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue / 24;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 168;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 6:
                    res = enterValue / 730.001;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 7:
                    res = enterValue / 8760;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 4) {
            switch (choice2) {
                case 1:
                    res = enterValue * 86400;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 1440;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue * 24;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue / 7;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 6:
                    res = enterValue / 30.417;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 7:
                    res = enterValue / 365;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 5) {
            switch (choice2) {
                case 1:
                    res = enterValue * 604800;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 10080;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue * 168;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue * 7;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 6:
                    res = enterValue / 4.345;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 7:
                    res = enterValue / 52.143;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 6) {
            switch (choice2) {
                case 1:
                    res = enterValue * 2.628e+6;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 43800.048;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue *  730.001;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue * 30.417;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue * 4.345;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 6:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 7:
                    res =  enterValue / 12;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else if (choice1 == 7) {
            switch (choice2) {
                case 1:
                    res = enterValue * 3.154e+7;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 2:
                    res = enterValue * 525600;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 3:
                    res = enterValue * 8760;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 4:
                    res = enterValue * 365;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 5:
                    res = enterValue * 52.143;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 6:
                    res = enterValue * 12;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                case 7:
                    res = enterValue;
                    JOptionPane.showMessageDialog(null, String.format("Result is %.3f", res));
                    ReDo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
                    ReDo();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Option");
        }
    }
}