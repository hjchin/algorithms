package implementation;

public class timeInWords {

    public static String run(int h, int minutes){
        String mString = "";

        if(minutes == 0) {
            return getHour(h)+" o' clock";
        }

        if(minutes<=30){
            return getMinutes(minutes)+ " past " + getHour(h);
        }

        h++;
        if(h==13) {
            h = 1;
        }
        minutes = 60 - minutes;
        return getMinutes(minutes)+" to "+getHour(h);
    }

    public static String getMinutes(int minutes){
        switch(minutes){
            case 1: return "one minute";
            case 2: return "two minutes";
            case 3: return "three minutes";
            case 4: return "four minutes";
            case 5: return "five minutes";
            case 6: return "six minutes";
            case 7: return "seven minutes";
            case 8: return "eight minutes";
            case 9: return "night minutes";
            case 10: return "ten minutes";
            case 11: return "eleven minutes";
            case 12: return "twelve minutes";
            case 13: return "thirteen minutes";
            case 14: return "fourteen minutes";
            case 15: return "quarter";
            case 16: return "sixteen minutes";
            case 17: return "seventeen minutes";
            case 18: return "eighteen minutes";
            case 19: return "nineteen minutes";
            case 20: return "twenty minutes";
            case 21: return "twenty one minutes";
            case 22: return "twenty two minutes";
            case 23: return "twenty three minutes";
            case 24: return "twenty four minutes";
            case 25: return "twenty five minutes";
            case 26: return "twenty six minutes";
            case 27: return "twenty seven minutes";
            case 28: return "twenty eight minutes";
            case 29: return "twenty nine minutes";
            default: return "half";
        }
    }

    public static String getHour(int h){
        switch(h){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "night";
            case 10: return "ten";
            case 11: return "eleven";
            default: return "twelve";
        }
    }
}
