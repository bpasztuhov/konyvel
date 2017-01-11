package hu.pasztuhov.ugyvitel.main;
import java.util.*;

public interface View {
	void sendData(String key, String value);
	void setControl(Control control);
}
