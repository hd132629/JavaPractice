package org.dimigo.exception;

public class MovieTest {

	public static void main(String[] args) {
		try{
			Movie[] movies = {
				new Movie("엔트맨", 12), new Movie("사도", 12), new Movie("베테랑", 15)
			};
			
			int age = 13;
			
			for(Movie movie : movies){
					buyTicket(movie, age);
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void buyTicket(Movie movie, int age) throws AgeCheckException{
		if (age < movie.getLimitAge())
			throw new AgeCheckException(movie);
		else 
			System.out.println(movie.getTitle() + "영화 즐감하세용~~~");
	}

}
