/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author S542000
 */
public enum MovieGenre {
   ACTION(12000),
   HORROR(1000),
   COMEDY(1500);
   private final double budget;

    private MovieGenre(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "MovieGenre{" + "budget=" + budget + '}';
    }
    
}
