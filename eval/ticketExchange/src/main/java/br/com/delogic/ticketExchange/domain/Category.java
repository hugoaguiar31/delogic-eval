package br.com.delogic.ticketExchange.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category implements Serializable {
   
	private static final long serialVersionUID = 5017154300744573973L;

	

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categories.id
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
     * This field corresponds to the database column categories.group_name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "groupName")
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categories.name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "name")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column categories.description
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
	@Column(name = "description")
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.id
     *
     * @return the value of categories.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.id
     *
     * @param id the value for categories.id
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.group_name
     *
     * @return the value of categories.group_name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.group_name
     *
     * @param groupName the value for categories.group_name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.name
     *
     * @return the value of categories.name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.name
     *
     * @param name the value for categories.name
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column categories.description
     *
     * @return the value of categories.description
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column categories.description
     *
     * @param description the value for categories.description
     *
     * @mbg.generated Fri Dec 06 15:58:29 BRT 2024
     */
    public void setDescription(String description) {
        this.description = description;
    }
}