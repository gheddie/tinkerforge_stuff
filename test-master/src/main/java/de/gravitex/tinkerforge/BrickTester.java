package de.gravitex.tinkerforge;

import java.io.IOException;
import java.net.UnknownHostException;

import com.tinkerforge.AlreadyConnectedException;
import com.tinkerforge.BrickMaster;
import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;

public class BrickTester {

	public void test() throws UnknownHostException, AlreadyConnectedException, IOException, NotConnectedException, TimeoutException, InterruptedException {
		IPConnection conn = new IPConnection();
		BrickMaster master = new BrickMaster("6wwtEr", conn);
		conn.connect("localhost", 4223);
		System.out.println("brick at " + master.getStackVoltage() + " volt...");
		for (int i=5;i>=0;i--) {
			Thread.sleep(1000);
			System.out.println(i + "...");
		}
		System.out.println("resetting...");
		master.reset();
		conn.disconnect();
	}
}
