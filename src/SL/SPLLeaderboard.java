package SL;

import java.util.TreeMap;

public class SPLLeaderboard {
     static class Team implements Comparable<Team>{
         String name;
         int totalPoints;
         int totalWins;

         Team(String name){
             this.name = name;
             this.totalPoints = 0;
             this.totalWins = 0;
         }

         @Override
         public int compareTo(Team other){
             if(this.totalPoints != other.totalPoints){
                 return other.totalPoints - this.totalPoints;
             }
             if(this.totalWins != other.totalWins){
                 return other.totalWins - this.totalWins;
             }
             return this.name.compareTo(other.name);
         }

         @Override
         public String toString(){
             return name + "| Points: " + totalPoints + "| Wins: " + totalWins;
         }
     }

     private TreeMap<Team, Team> leaderBoard;

     SPLLeaderboard(){
         leaderBoard = new TreeMap<>();
     }

     public void addTeam(String teamName){
         Team team = new Team(teamName);
         leaderBoard.put(team, team);
     }
}
