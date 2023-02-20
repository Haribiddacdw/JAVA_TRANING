package day3;

public class Program4 {
   
}

class Cricket{
	
}

interface CricketBattingCoach{
	
    void trainingAreaBatting();
	void battingTraining();
	
}
interface CricketBowlingCoach{
	
	void trainingAreaBowling();
	void bowlingTraining();
	
}
interface CricketFitnessCoach{
	
	void trainingArea();
	void fitnessTraining();
	
}

interface TeamIndia extends CricketBattingCoach,CricketBowlingCoach,CricketFitnessCoach{
	
	void age();
	
	
}

class CricketPlayer extends Cricket implements TeamIndia {
	
	CricketPlayer(){
		
	}
	@Override
	public void trainingAreaBatting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trainingAreaBowling() {
		// TODO Auto-generated method stub
		
	}
    
	@Override
	public void trainingArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void battingTraining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bowlingTraining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fitnessTraining() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		
	}
	public  void method1(CricketBattingCoach cp) {
		
	}
	public void method2(CricketBowlingCoach cp) {
		
	}
	public void method3(CricketFitnessCoach cp) {
	
}
	public void method4(TeamIndia cp) {
	
}
	 public static void main(String[] args) {
	    	CricketPlayer cp = new CricketPlayer();
	    	cp.method1(cp);
	    	
	    	
	    }

	
}