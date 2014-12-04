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
		System.out.println(master.getStackVoltage());
		Thread.sleep(5000);
		master.reset();
		conn.disconnect();
	}
}
