package br.com.delogic.ticketExchange.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{
	
	private static final long serialVersionUID = -4419816772993270608L;
	
   	

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
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
     * This field corresponds to the database column users.username
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "name")
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.firstname
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "firstname")
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.lastname
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "lastname")
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.city
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	
	@Column(name = "city")
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.state
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	
	@Column(name = "state")
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.email
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	
	@Column(name = "email")
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.phone
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "phone")
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.sports
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "sports")
    private Boolean sports;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.theatre
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "theatre")
    private Boolean theatre;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.concerts
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "concerts")
    private Boolean concerts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.jazz
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "jazz")
    private Boolean jazz;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.classical
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "classical")
    private Boolean classical;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.opera
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "opera")
    private Boolean opera;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.rock
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "rock")
    private Boolean rock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.vegas
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "vegas")
    private Boolean vegas;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.broadway
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "broadway")
    private Boolean broadway;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.musicals
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "musicals")
    private Boolean musicals;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.firstname
     *
     * @return the value of users.firstname
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.firstname
     *
     * @param firstname the value for users.firstname
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.lastname
     *
     * @return the value of users.lastname
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.lastname
     *
     * @param lastname the value for users.lastname
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.city
     *
     * @return the value of users.city
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.city
     *
     * @param city the value for users.city
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.state
     *
     * @return the value of users.state
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.state
     *
     * @param state the value for users.state
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.email
     *
     * @return the value of users.email
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.email
     *
     * @param email the value for users.email
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.phone
     *
     * @return the value of users.phone
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.phone
     *
     * @param phone the value for users.phone
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.sports
     *
     * @return the value of users.sports
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getSports() {
        return sports;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.sports
     *
     * @param sports the value for users.sports
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setSports(Boolean sports) {
        this.sports = sports;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.theatre
     *
     * @return the value of users.theatre
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getTheatre() {
        return theatre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.theatre
     *
     * @param theatre the value for users.theatre
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setTheatre(Boolean theatre) {
        this.theatre = theatre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.concerts
     *
     * @return the value of users.concerts
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getConcerts() {
        return concerts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.concerts
     *
     * @param concerts the value for users.concerts
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setConcerts(Boolean concerts) {
        this.concerts = concerts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.jazz
     *
     * @return the value of users.jazz
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getJazz() {
        return jazz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.jazz
     *
     * @param jazz the value for users.jazz
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setJazz(Boolean jazz) {
        this.jazz = jazz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.classical
     *
     * @return the value of users.classical
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getClassical() {
        return classical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.classical
     *
     * @param classical the value for users.classical
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setClassical(Boolean classical) {
        this.classical = classical;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.opera
     *
     * @return the value of users.opera
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getOpera() {
        return opera;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.opera
     *
     * @param opera the value for users.opera
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setOpera(Boolean opera) {
        this.opera = opera;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.rock
     *
     * @return the value of users.rock
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getRock() {
        return rock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.rock
     *
     * @param rock the value for users.rock
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setRock(Boolean rock) {
        this.rock = rock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.vegas
     *
     * @return the value of users.vegas
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getVegas() {
        return vegas;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.vegas
     *
     * @param vegas the value for users.vegas
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setVegas(Boolean vegas) {
        this.vegas = vegas;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.broadway
     *
     * @return the value of users.broadway
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getBroadway() {
        return broadway;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.broadway
     *
     * @param broadway the value for users.broadway
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setBroadway(Boolean broadway) {
        this.broadway = broadway;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.musicals
     *
     * @return the value of users.musicals
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Boolean getMusicals() {
        return musicals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.musicals
     *
     * @param musicals the value for users.musicals
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setMusicals(Boolean musicals) {
        this.musicals = musicals;
    }
}