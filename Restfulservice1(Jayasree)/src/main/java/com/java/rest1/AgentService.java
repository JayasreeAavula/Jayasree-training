package com.java.rest1;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.rest1.AgentExam;
import com.java.rest1.AgentDAO;

@Path("/agentexam")
public class AgentService {
	@POST
	@Path("/addagent")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String addAgent(AgentExam agent) throws ClassNotFoundException, SQLException {
		AgentDAO dao = new AgentDAO();
		return dao.addAgent(agent);
	}
	
	@GET
	@Path("/showagent")
	@Produces(MediaType.APPLICATION_JSON)
	public AgentExam[] showAgent() throws ClassNotFoundException, SQLException {
		AgentDAO dao = new AgentDAO();
		AgentExam[] agents =dao.showAgent();
		return agents;
	}
	
	@GET
	@Path("/searchagent/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public AgentExam searchAgent(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		AgentDAO dao = new AgentDAO();
		AgentExam agent= dao.searchAgent(id);
		return agent;
	}
}