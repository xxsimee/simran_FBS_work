class Player{
	String name;
	int age;
	String country;
	int matchesPlayed;
	int jerseyNumber;
	
	Player() {
		super();
		this.name = "Not given";
		this.age = 0;
		this.country = "Not Given";
		this.matchesPlayed = 0;
		this.jerseyNumber = 0;
	}
	Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseyNumber = jerseyNumber;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	int getMatchesPlayed() {
		return matchesPlayed;
	}
	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	int getJerseyNumber() {
		return jerseyNumber;
	}
	void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	@Override
	public String toString() {
		return "\nPlayer Name:"+this.name+"\nPlayer age: "+this.age+"\nCountry:"+this.country+"\nMatche Played: "+this.matchesPlayed+"\nJersey Number: "+this.jerseyNumber;
	}
}

class CricketPlayer extends Player{
	int totalRuns;
	int totalWickets;
	String battingStyle;
	String bowlingStyle;
	
	CricketPlayer() {
		super();
		this.totalRuns = 0;
		this.totalWickets = 0;
		this.battingStyle = "Not Given";
		this.bowlingStyle = "Not Given";
	}
	
	CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber,int totalRuns, int totalWickets, String battingStyle, String bowlingStyle) {
		super(name,age,country,matchesPlayed,jerseyNumber);
		this.totalRuns = totalRuns;
		this.totalWickets = totalWickets;
		this.battingStyle = battingStyle;
		this.bowlingStyle = bowlingStyle;
	}

	int getTotalRuns() {
		return totalRuns;
	}

	void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	int getTotalWickets() {
		return totalWickets;
	}

	void setTotalWickets(int totalWickets) {
		this.totalWickets = totalWickets;
	}

	String getBattingStyle() {
		return battingStyle;
	}

	void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	String getBowlingStyle() {
		return bowlingStyle;
	}

	void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTotal Runs:"+this.totalRuns+"\nTotal Wicket:"+this.totalWickets+"\nBatting Style:"+this.battingStyle+"\nBowling Style:"+this.bowlingStyle;
	}
	
}

class FootballPlayer extends Player{
	int totalGoals;
	String playingPosition;
	
	FootballPlayer() {
		super();
		this.totalGoals = 0;
		this.playingPosition = "Not Given";
	}
	FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber,int totalGoals, String playingPosition) {
		super(name,age,country,matchesPlayed,jerseyNumber);
		this.totalGoals = totalGoals;
		this.playingPosition = playingPosition;
	}
	int getTotalGoals() {
		return totalGoals;
	}
	void setTotalGoals(int totalGoals) {
		this.totalGoals = totalGoals;
	}
	String getPlayingPosition() {
		return playingPosition;
	}
	void setPlayingPosition(String playingPosition) {
		this.playingPosition = playingPosition;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTotal Goal: "+this.totalGoals+"\nPlaying Position"+this.playingPosition;
	}
	
}
class PlayerTest {
	public static void main(String[] args) {
		System.out.println("Player Details:");
		Player p1=new Player("Rita",34,"India",34,100);
		System.out.println(p1);
		System.out.println();
		
		System.out.println("Cricket Player:");
		p1=new CricketPlayer("Virat", 35, "India", 34, 101,299, 87, "aggressive,","right-arm medium-pace");
		System.out.println(p1);
		System.out.println();
		
		System.out.println("Football Player: ");
		p1=new FootballPlayer("Ronaldo",51,"Portugal", 1300, 7,980, "forward");
		System.out.println(p1);
		
}
}
