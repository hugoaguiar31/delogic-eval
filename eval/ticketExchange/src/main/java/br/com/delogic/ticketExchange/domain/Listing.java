package br.com.delogic.ticketExchange.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "listings")
public class Listing implements Serializable {
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = -7124126593448679034L;
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listings.id
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
     * This field corresponds to the database column listings.seller_id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    

   

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listings.event_id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listings.date_id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    
    @ManyToOne
    @JoinColumn(name = "date_id")
    private br.com.delogic.ticketExchange.domain.Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listings.number_of_tickets
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "number_of_tickets")
    private Integer numberOfTickets;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listings.price_per_ticket
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "price_per_ticket")
    private BigDecimal pricePerTicket;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listings.total_price
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "total_price")
    private BigDecimal totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listings.listing_time
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "listing_time")
    private java.util.Date listingTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listings.id
     *
     * @return the value of listings.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listings.id
     *
     * @param id the value for listings.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

   /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listings.number_of_tickets
     *
     * @return the value of listings.number_of_tickets
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listings.number_of_tickets
     *
     * @param numberOfTickets the value for listings.number_of_tickets
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listings.price_per_ticket
     *
     * @return the value of listings.price_per_ticket
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public BigDecimal getPricePerTicket() {
        return pricePerTicket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listings.price_per_ticket
     *
     * @param pricePerTicket the value for listings.price_per_ticket
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setPricePerTicket(BigDecimal pricePerTicket) {
        this.pricePerTicket = pricePerTicket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listings.total_price
     *
     * @return the value of listings.total_price
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listings.total_price
     *
     * @param totalPrice the value for listings.total_price
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listings.listing_time
     *
     * @return the value of listings.listing_time
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public java.util.Date getListingTime() {
        return listingTime;
    } 

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listings.listing_time
     *
     * @param listingTime the value for listings.listing_time
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setListingTime(java.util.Date listingTime) {
        this.listingTime = listingTime;
    }

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public br.com.delogic.ticketExchange.domain.Date getDate() {
		return date;
	}

	public void setDate(br.com.delogic.ticketExchange.domain.Date date) {
		this.date = date;
	}
    
    
    
    
}