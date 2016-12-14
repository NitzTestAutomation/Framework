package Background_Logic.Core;


import java.util.Date;

public class Timer {

public static long starttime;

public void startTime(){
	
	starttime=getTime();
	
}

public long getTime(){
	
	return new Date().getTime();
	
}

public boolean timeExpired(int time){
	
	int difference=(int)((getTime()-(starttime))/1000);
	
	return difference>time;
	
}


}
