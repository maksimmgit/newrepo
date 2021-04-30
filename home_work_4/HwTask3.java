package home_work_4;

import java.util.concurrent.TimeUnit;

public class HwTask3 {

    String toWeek(int day){
        int week = day/7;
            if (week % 10 == 1) {
                return "я";
            } else if (week % 10 > 1 && week % 10 < 5) {
                return "и";
            } else {
                return "ь";
            }
        }


    String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat){
        StringBuilder stringB = new StringBuilder();
        long hours = 1000*60*60;
        long mins = 1000*60;
        long seconds = 1000;
        long temp;
        if(shortFormat){
            int hour = (int) (millisecond/hours);
            temp = (millisecond - hour*hours);
            int min = (int) (temp/mins);
            temp -=  min*mins;
            int sec = (int) (temp/seconds);
            temp -= sec*seconds;
            stringB.append(temp);
            if(temp/100 == 0){
                stringB.insert(0,0);
                if(temp/10 == 0){
                    stringB.insert(0,0);
                }
            }
            stringB.insert(0, ".").insert(0, sec);
            if(sec/10 == 0){
                stringB.insert(0,0);
            }
            stringB.insert(0, ".").insert(0, min);
            if(min/10 == 0){
                stringB.insert(0,0);
            }
            stringB.insert(0, ".").insert(0, hour);
            if(hour/10 == 0){
                stringB.insert(0,0);
            }

        }else{


            int hour = (int) (millisecond/hours);
            stringB.append(hour).append(hourWord(hour));
            temp = (millisecond - hour*hours);
            int min = (int) (temp/mins);
            stringB.append(min).append(minsWord(min));
            temp -=  min*mins;
            int sec = (int) (temp/seconds);
            stringB.append(sec).append(secWord(sec));
            temp -= sec*seconds;
            stringB.append(temp).append(msWord(temp));
        }


        return stringB.toString();
    }





    public String minsWord(long mins) {
        StringBuilder stringB = new StringBuilder();
        if ((mins%10 == 1) && (mins != 11)) {
            return stringB.append(" минута ").toString();
        } else if (mins%10 > 1 && mins %10 < 5 && (mins !=12 && mins !=13 && mins !=14)) {
            return stringB.append(" минуты ").toString();
        } else {
            return stringB.append(" минут ").toString();
        }
    }

    public String hourWord(long hours) {
        StringBuilder stringB = new StringBuilder();
        if ((hours%10 == 1) && (hours != 11)) {
            return stringB.append(" час ").toString();
        } else if (hours%10 > 1 && hours %10 < 5 && (hours !=12 && hours !=13 && hours !=14)) {
            return stringB.append(" часа ").toString();
        } else {
            return stringB.append(" часов ").toString();
        }
    }

    public String secWord(long seconds) {
        StringBuilder stringB = new StringBuilder();
        if ((seconds%10 == 1) && (seconds != 11)) {
            return stringB.append(" секунда ").toString();
        } else if (seconds%10 > 1 && seconds %10 < 5 && (seconds !=12 && seconds !=13 && seconds !=14)) {
            return stringB.append(" секунды ").toString();
        } else {
            return stringB.append(" секунд ").toString();
        }
    }

    public String msWord(long ms) {
        StringBuilder stringB = new StringBuilder();
        if ((ms%10 == 1) && (ms != 11)) {
            return stringB.append(" миллисекунда.").toString();
        } else if (ms%10 > 1 && ms %10 < 5 && (ms !=12 && ms !=13 && ms !=14)) {
            return stringB.append(" миллисекунды.").toString();
        } else {
            return stringB.append(" миллисекунд.").toString();
        }
    }

}
