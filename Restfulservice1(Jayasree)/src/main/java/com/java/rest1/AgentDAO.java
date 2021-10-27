package com.java.rest1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AgentDAO {
	Connection connection;
	PreparedStatement pst;
public AgentExam searchAgent(int agentid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from AgentExam where agentid=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentid);
		ResultSet rs = pst.executeQuery();
		AgentExam agent = null;
		if (rs.next()) {
			agent = new AgentExam();
            agent.setAgentID(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setGender(rs.getString("gender"));
			agent.setCity(rs.getString("city"));
            agent.setMaritalStatus(rs.getInt("maritalstatus"));
			agent.setPremium(rs.getDouble("premium"));
		}
		return agent;
	}

	public AgentExam[] showAgent() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from AgentExam";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<AgentExam> agentList = new ArrayList<AgentExam>();
		AgentExam agent = null;
		while(rs.next()) {
			agent = new AgentExam();
			agent.setAgentID(rs.getInt("agentid"));
			agent.setName(rs.getString("name"));
			agent.setGender(rs.getString("gender"));
			agent.setCity(rs.getString("city"));
            agent.setMaritalStatus(rs.getInt("maritalstatus"));
			agent.setPremium(rs.getDouble("premium"));
			agentList.add(agent);
		}
	    return agentList.toArray(new AgentExam[agentList.size()]);
	}
	
	public String addAgent(AgentExam agent) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into AgentExam(agentId,name,city,gender,maritalStatus,premium) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1,agent.getAgentID());
		pst.setString(2, agent.getName());
		pst.setString(3, agent.getCity());
		pst.setString(4, agent.getGender());
		pst.setInt(5, agent.getMaritalStatus());
		pst.setDouble(6, agent.getPremium());
		pst.executeUpdate();
		return "Record Inserted...";
	}


	
}