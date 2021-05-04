package _05_netflix;

public class Watching {
	static NetflixQueue netflix = new NetflixQueue();
	public static void main(String[] args) {
		Movie lebowski = new Movie("the big lebowski", 5);
		Movie forest = new Movie("Forest Gump", 4);
		Movie titanic = new Movie("Titanic", 3);
		Movie starwars = new Movie("Star Wars", 5);
		Movie toystory = new Movie("Toy Story", 5);
		System.out.println(forest.getTicketPrice());
		netflix.addMovie(forest);
		netflix.addMovie(toystory);
		netflix.addMovie(starwars);
		netflix.addMovie(lebowski);
		netflix.addMovie(titanic);
		System.out.println(forest);
		System.out.println(lebowski);
		System.out.println(titanic);
		System.out.println(starwars);
		System.out.println(toystory);
		netflix.sortMoviesByRating();
		
		System.out.println("The best movie is" + netflix.getBestMovie());
		System.out.println("The second best movie is" + netflix.getMovie(1));
		System.out.println("The third best movie is" + netflix.getMovie(2));
		System.out.println("The 4th best movie is" + netflix.getMovie(3));
		System.out.println("The worst movie is" + netflix.getMovie(4));
	}
}
