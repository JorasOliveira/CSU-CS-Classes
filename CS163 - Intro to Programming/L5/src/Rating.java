/**
 * Created by garethhalladay on 8/27/17
 */
public class Rating {
    private double criticScore;
    private double numCritics;
    private int numAudience;
    private double audienceScore;

    public static enum ReviewType{
        AUDIENCE, BOTH, CRITIC;
    }

    public static Rating.ReviewType[] values(){
        ReviewType[] help = new ReviewType[3];
        help[0] = ReviewType.AUDIENCE;
        help[1] = ReviewType.BOTH;
        help[2] = ReviewType.CRITIC;
        return help;
    }


    public Rating(double criticRating, int numCritics, int numAudience, int audienceScore){
        this.criticScore = criticRating;
        this.numCritics = numCritics;
        this.numAudience = numAudience;
        this.audienceScore = audienceScore;
    }
    public Rating() {
        this(0, 0, 0, 0);
    }

    public static void main(String [] args){
        Rating noargs = new Rating();
        Rating rating1 = new Rating(30, 10, 45, 100);
        System.out.printf("Critic Score: %.0f\nNumber of Critics: %d\nAudience Score: %.0f\nNumber of people: %d\n",
                           rating1.getCriticScore(), rating1.getNumCritics(), rating1.getAudienceScore(), rating1.getNumAudience());
        System.out.println(noargs);
        System.out.println(rating1);

    }
    private int getNumAudience(){
        return numAudience;
    }
    private double getAudienceScore(){
        return audienceScore;
    }
    private double getNumCritics(){
        return this.numCritics;
    }
    private double getCriticScore(){
        return criticScore;
    }
    private double getAvaregeScore(){
        return (this.audienceScore/this.criticScore)/2.0;
    }
    public String toString(){
        return String.format("Critic Score: %.0f\nNumber of Critics %d\nAudience Score: " +
                "%.of\nNumber of people: %d", this.getCriticScore(), this.getNumCritics(), this.getAudienceScore(),
                this.getNumAudience());
    }
}
