package br.com.delogic.ticketExchange.domain;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Event implements Serializable{
    
	private static final long serialVersionUID = 6266927031023407987L;
	

	/**
	 * 
	 */
	
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events.venue_id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events.category_id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	 @ManyToOne
	 @JoinColumn(name = "category_id")
	 private Category category;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events.date_id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
   
	 
    @ManyToOne
    @JoinColumn(name = "date_id")
    private Date date;

    


	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events.name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "name")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events.event_start
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "event_start")
    private java.util.Date eventStart;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events.id
     *
     * @return the value of events.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events.id
     *
     * @param id the value for events.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

   

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events.name
     *
     * @return the value of events.name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events.name
     *
     * @param name the value for events.name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events.event_start
     *
     * @return the value of events.event_start
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public java.util.Date getEventStart() {
        return eventStart;
    } 

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events.event_start
     *
     * @param eventStart the value for events.event_start
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setEventStart(java.util.Date eventStart) {
        this.eventStart = eventStart;
    }
    
    public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
}