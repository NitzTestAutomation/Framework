package Background_Logic.Core;

public class TestInfo {

private static String Time_Stamp,
				Suite,
				Name,
				Id,
				Note,
				Expected,
				Actual,
				Version;


public void reset(){
	
		Time_Stamp=null;
		Suite=null;
		Name=null;
		Id=null;
		Note=null;
		Expected=null;
		Actual=null;
		Version=null;
	
}

public TestInfo timeStamp(String value){
	
	Time_Stamp=value;
	return this;
	
	
	
}

public TestInfo suite(String value){
	
	Suite=value;
	return this;
	
	
	
}

public TestInfo name(String value){
	
	Name=value;
	return this;
	
	
	
}

public TestInfo id(String value){
	
	Id=value;
	return this;
	
	
	
}

public TestInfo note(String value){
	
	Note=value;
	return this;
	
	
	
}

public TestInfo expected(String value){
	
	Expected=value;
	return this;
	
	
	
}

public TestInfo actual(String value){
	
	Actual=value;
	return this;
	
	
	
}

public TestInfo version(String value){
	
	Version=value;
	return this;
	
	
	
}

public static String timeStamp(){
	
	return Time_Stamp;
}

public static String suite(){
	
	return Suite;
}

public static String name(){
	
	return Name;
}

public static String id(){
	
	return Id;
}

public static String note(){
	
	return Note;
}

public static String expected(){
	
	return Expected;
}

public static String actual(){
	
	return Actual;
}

public static String version(){
	
	return Version;
}

public static void printResults(){
	
	MyLogger.log.info("Test Id: "+id());
	MyLogger.log.info("Test Name: "+name());
	MyLogger.log.info("Test Suite: "+suite());
	
	
	
}





}
