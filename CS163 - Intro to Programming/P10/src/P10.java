// P10 Assignment
// Author: Joras C C de Oliveira
// Apr 6, 2018
// Class: CSS163/164
// Email: j0r4s@rams.colostate.edu


import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class P10 implements Interface {


    @Override
    public Temperature[] readTemperatures(String filename) {


        try{
            Scanner fileScn = new Scanner(new File(filename));
            Temperature[] tempArray = new Temperature[86975];
            int i = 0;
            fileScn.nextLine();
            while (fileScn.hasNextLine()){
                String line = fileScn.nextLine();
                String[] arr = line.split("\\s+");

                String tempDate = arr[0];
                String tempHour = arr[1];
                double tempDegree = Double.parseDouble(arr[2]);
                double tempWind = Double.parseDouble(arr[3]);

                tempArray[i] = new Temperature(tempDate, tempHour, tempDegree,tempWind);
                i++;

            }

            return tempArray;

        }

        catch (FileNotFoundException e){
            e.printStackTrace();

        }

        return null;
    }

    @Override
    public double findMinimum(Date start, Date end, Temperature[] data) {
        double minTemp = Double.MAX_VALUE ;
        double tempTemp;

        for (int i = 0; i < data.length; i++){

            boolean foo = data[i].inInterval(start, end);

            if (foo){

                tempTemp = data[i].temperature;

                if (tempTemp < minTemp){

                    minTemp = data[i].temperature;
                }

            }
        }
        return minTemp;

    }

    @Override
    public double findMaximum(Date start, Date end, Temperature[] data) {

        double maxTemp = Double.MIN_VALUE ;
        double tempTemp;

        for (int i = 0; i < data.length; i++){

            boolean foo = data[i].inInterval(start, end);

            if (foo){

                tempTemp = data[i].temperature;

                if (tempTemp > maxTemp){

                    maxTemp = data[i].temperature;
                }

            }
        }
        return maxTemp;

    }

    @Override
    public double findAverage(Date start, Date end, Temperature[] data) {
        double average = 0;
        double finalAverage;
        int divisor = 0;
        for (int i = 0; i < data.length; i++){

            boolean foo = data[i].inInterval(start, end);

            if (foo){

                divisor++;
               average += data[i].temperature;
            }

        }

        finalAverage = average / divisor;
        return finalAverage;
    }

    @Override
    public double findHighest(Date start, Date end, Temperature[] data) {
        double maxWind = Double.MIN_VALUE ;
        double tempWind;

        for (int i = 0; i < data.length; i++){

            boolean foo = data[i].inInterval(start, end);

            if (foo){

                tempWind = data[i].windspeed;

                if (tempWind > maxWind){

                    maxWind = data[i].windspeed;
                }

            }
        }
        return maxWind;
    }



    public static void main(String[] args) {
        // Instantiate student code
        P10 p10 = new P10();

        // Test readTemperatures
        Temperature[] data = p10.readTemperatures(args[0]);




         //Test findMinimum
        Date start = Temperature.createDate("04-Jul-2008", "06:00");
        Date end = Temperature.createDate("17-Aug-2010", "23:00");
        System.out.println("Verifying findMinimum method:");
        System.out.println("Start date: " + start.toString());
        System.out.println("End date: " + end.toString());
        System.out.printf("Minimum = %.1f degrees\n", p10.findMinimum(start, end, data));

         //Test findMaximum
        start = Temperature.createDate("19-Sep-2011", "07:00");
        end = Temperature.createDate("23-Mar-2015", "13:00");
        System.out.println("Verifying findMaximum method:");
        System.out.println("Start date: " + start.toString());
        System.out.println("End date: " + end.toString());
        System.out.printf("Maximum = %.1f degrees\n", p10.findMaximum(start, end, data));


        // Test findAverage
        start = Temperature.createDate("09-Apr-2006", "19:00");
        end = Temperature.createDate("31-Oct-2013", "10:00");
        System.out.println("Verifying findAverage method:");
        System.out.println("Start date: " + start.toString());
        System.out.println("End date: " + end.toString());
        System.out.printf("Average = %.1f degrees\n", p10.findAverage(start, end, data));

        // Test findHighest
        start = Temperature.createDate("01-Jan-2015", "00:00");
        end = Temperature.createDate("31-Dec-2015", "23:00");
        System.out.println("Verifying findHighest method:");
        System.out.println("Start date: " + start.toString());
        System.out.println("End date: " + end.toString());
        System.out.printf("Highest windspeed = %.1f\n", p10.findHighest(start, end, data));
    }

    }


