package br.com.delogic.ticketExchange.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import br.com.delogic.ticketExchange.controller.DateController;
import br.com.delogic.ticketExchange.dto.DateDTO;
import br.com.delogic.ticketExchange.service.DateService;


public class DateControllerTest {

       
		    
	 @Mock
	 private DateService dateService;
	 
	 @InjectMocks
	 private DateController dateController;

	 @BeforeEach
	 public void setUpMocks() {
	    MockitoAnnotations.openMocks(this);
	 }
	 
	
	 @Test
	 public void testGetAllDateIds_Ok() {		  
		   
	       List<Long> listaId = Collections.singletonList(Long.valueOf(1));
	       Pageable pageable = PageRequest.of(0, 10);
	       Page<Long> page = new PageImpl<Long>(listaId,pageable,1L) ; 
	       Optional<Page<Long>> mockValue = Optional.of(page);	       
	                 
	       when(dateService.getAllIds(pageable)).thenReturn(mockValue);
	       ResponseEntity<Page<Long>> response = dateController.getAllDateIds(pageable);
	       assertEquals(ResponseEntity.ok(page), response);
	       
	 }

	 @Test
	 public void testGetDateById_Ok() {		  
		    
		   DateDTO dateDTO = new DateDTO();  
		   dateDTO.setId(1L);
		   Optional<DateDTO> mockValue = Optional.of(dateDTO);	
	           
	       when(dateService.getDateById(1L)).thenReturn(mockValue);
	       ResponseEntity<DateDTO> response = dateController.getDateById(1L);
	       assertEquals(ResponseEntity.ok(dateDTO), response);
	       
	 }      

   
}

