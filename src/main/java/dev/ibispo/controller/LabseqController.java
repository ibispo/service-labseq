package dev.ibispo.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.ibispo.entity.LabseqEntity;
import dev.ibispo.service.LabseqService;

@Path("/labseq")
public class LabseqController {

	@Inject
	LabseqService service;
	
	@GET
	@Path("index/{index}")
	public Integer showLabseq(Integer index) {
		return service.getLabseqCalculated(index);
	}
	
	@POST
	@Transactional
	@Path("/{index}/{result}")
	public void addLabseq(Integer index, Integer result) {
		service.addLanseq(index, result);
	}
	
    @GET
	@Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<LabseqEntity> list() {
        return service.getListLabseq();
    }

    @GET()
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello my darling Isa!";
    }
    
}
