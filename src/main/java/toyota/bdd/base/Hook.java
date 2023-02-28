package toyota.bdd.base;

import static toyota.bdd.utils.IConstant.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import toyota.bdd.utils.ReadProperties;

public class Hook {
	BaseClass baseClass;
	ReadProperties envVar = new ReadProperties();
	
	@Before
	public void initDriver () {
		baseClass = new BaseClass();
		baseClass.setUpDriver(BROWSER);
	}
	
	@After 
	public void exitingDriver () {
		baseClass.tearUp();
	}

}
