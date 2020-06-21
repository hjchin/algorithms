package searching;

import javafx.util.Pair;

import java.util.*;

/*
The city of Gridland is represented as an  matrix where the rows are numbered from  to  and the columns are numbered from  to .

Gridland has a network of train tracks that always run in straight horizontal lines along a row. In other words, the start and end points of a train track are  and , where  represents the row number,  represents the starting column, and  represents the ending column of the train track.

The mayor of Gridland is surveying the city to determine the number of locations where lampposts can be placed. A lamppost can be placed in any cell that is not occupied by a train track.

Given a map of Gridland and its  train tracks, find and print the number of cells where the mayor can place lampposts.

 */
public class GridlandMetro {

    static int run(int n, int m, int k, int[][] track){

        int emptyCell = 0;
        HashMap<Integer, ArrayList<Track>> trackPoints = new HashMap<>();
        for(int i=0;i<track.length;i++){
            addTrack(trackPoints, track[i][0], track[i][1],track[i][2]);
        }

        for(Map.Entry<Integer,ArrayList<Track>> e: trackPoints.entrySet()){
            ArrayList<Track> tracks = e.getValue();
            merge(tracks);
            int occupied = getOccupied(tracks);
            emptyCell += m - occupied;
        }

        emptyCell += (n-trackPoints.size())*m;

        return emptyCell;
    }

    public static void addTrack(HashMap<Integer, ArrayList<Track>> trackPoints, Integer key, int start, int end){
        if(trackPoints.get(key) == null) {
            ArrayList<Track> l = new ArrayList<>();
            trackPoints.put(key, l);
        }

        ArrayList<Track> l = trackPoints.get(key);
        l.add(new Track(start, end));
    }

    public static void merge(ArrayList<Track> input){

        for(int i=0;i<input.size()-1;i++){
            Track t = input.get(i);
            int j = i+1;
            while(j<input.size()){
                Track t1 = input.get(j);
                Track n = overlap(t,t1);
                if(n != null){
                    input.set(i, n);
                    input.remove(t1);
                    j = i+1;
                    t = input.get(i);
                }else{
                    j++;
                }
            }
        }
    }

    public static Track overlap(Track t1, Track t2){
        //case overlap on the left
        if(t1.start <= t2.start && t2.start<=t1.end && t2.end >= t1.end){
            return new Track(t1.start, t2.end);
        }
        //case overlap on the right
        else if(t2.end>=t1.start && t2.start<=t1.start && t1.end>=t2.end){
            return new Track(t2.start,t1.end);
        }
        //case overlap on both side (greater)
        else if(t2.start<=t1.start && t2.end>= t1.end){
            return new Track(t2.start,t2.end);
        }
        //case overlap on both side (smaller)
        else if(t2.start>=t1.start && t2.end<=t1.end){
            return new Track(t1.start,t1.end);
        }

        return null;
    }

    public static class Track implements Comparable<Track>{
        int start;
        int end;

        Track(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Track o) {
            if(start < o.start ){
                return -1;
            }else if(start > o.start){
                return 1;
            }else{
                return 0;
            }
        }
    }

    public static int getOccupied(ArrayList<Track> tracks){
        int occupiedCell = 0;
        for(int i=0;i<tracks.size();i++){
            occupiedCell += tracks.get(i).end -tracks.get(i).start + 1;
        }
        return occupiedCell;
    }


    public static int run2(int n, int m, int k, int[][] track){
        int occupiedCell = 0;
        HashMap<Integer, ArrayList<Track>> trackPoints = new HashMap<>();
        for(int i=0;i<track.length;i++){
            addTrack(trackPoints, track[i][0], track[i][1],track[i][2]);
        }

        for(Map.Entry<Integer,ArrayList<Track>> e: trackPoints.entrySet()){
            List<Track> tracks = e.getValue();
            Collections.sort(tracks);
            int start = tracks.get(0).start;
            int end = tracks.get(0).end;
            for(int i=1;i<tracks.size();i++){
                if(tracks.get(i).start > end){
                    occupiedCell += end - start + 1;
                    start = tracks.get(i).start;
                    end = tracks.get(i).end;
                }else{
                    end = Math.max(end, tracks.get(i).end);
                }
            }
            occupiedCell += end - start + 1;
        }

        return m*n-occupiedCell;
    }
}
