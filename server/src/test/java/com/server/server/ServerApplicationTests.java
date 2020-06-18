package com.server.server;

import com.com.server.Controller;
import com.employee.*;
import com.patterns.UserList;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@SpringBootTest
class ServerApplicationTests {


//test factory
	@Test
	void contextLoads() {
		assert (EmployeeFactory.createEmployeeByRank("Manager").getClass()==Manager.class);
		assert (EmployeeFactory.createEmployeeByRank("Worker").getClass()==Worker.class);
		assert (EmployeeFactory.createEmployeeByRank("Director").getClass()==Director.class);
	}
	//test fun sum
	@Test
	void test2()
	{
		UserList ul = new UserList();
		Director d =(Director) EmployeeFactory.createEmployeeByRank("Director");
		ul.add(d);
		ul.add(EmployeeFactory.createEmployeeByRank("Manager"));
		ul.add(EmployeeFactory.createEmployeeByRank("Worker"));
		ul.add(EmployeeFactory.createEmployeeByRank("Worker"));
		ul.add(EmployeeFactory.createEmployeeByRank("Worker"));
		assert (ul.remove1(d)==d);
	}
}
