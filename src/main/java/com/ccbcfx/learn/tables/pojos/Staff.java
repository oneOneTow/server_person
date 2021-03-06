/*
 * This file is generated by jOOQ.
*/
package com.ccbcfx.learn.tables.pojos;


import com.ccbcfx.learn.enums.DocumentType;
import com.ccbcfx.learn.enums.GenderType;
import com.ccbcfx.learn.enums.StaffStatusType;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.jooq.types.UInteger;



/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Staff implements Serializable {

    private static final long serialVersionUID = 1876107552;
    private UInteger        id;
    private String          name;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate       birthday;
    private String          phone;
    private GenderType      gender;
    private String          imgUrl;
    private DocumentType    documentType;
    private String          documentNumber;
    private StaffStatusType status;
    private Integer         createBy;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime   createAt;
    private Integer         updateBy;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime   updateAt;
    private Integer         deleteBy;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime   deleteAt;
    private Byte            enabled;

    public Staff() {}

    public Staff(Staff value) {
        this.id = value.id;
        this.name = value.name;
        this.birthday = value.birthday;
        this.phone = value.phone;
        this.gender = value.gender;
        this.imgUrl = value.imgUrl;
        this.documentType = value.documentType;
        this.documentNumber = value.documentNumber;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
        this.deleteBy = value.deleteBy;
        this.deleteAt = value.deleteAt;
        this.enabled = value.enabled;
    }

    public Staff(
        UInteger        id,
        String          name,
        LocalDate       birthday,
        String          phone,
        GenderType      gender,
        String          imgUrl,
        DocumentType    documentType,
        String          documentNumber,
        StaffStatusType status,
        Integer         createBy,
        LocalDateTime   createAt,
        Integer         updateBy,
        LocalDateTime   updateAt,
        Integer         deleteBy,
        LocalDateTime   deleteAt,
        Byte            enabled
    ) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.gender = gender;
        this.imgUrl = imgUrl;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.deleteBy = deleteBy;
        this.deleteAt = deleteAt;
        this.enabled = enabled;
    }

    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public GenderType getGender() {
        return this.gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public DocumentType getDocumentType() {
        return this.documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public StaffStatusType getStatus() {
        return this.status;
    }

    public void setStatus(StaffStatusType status) {
        this.status = status;
    }

    public Integer getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateAt() {
        return this.updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getDeleteBy() {
        return this.deleteBy;
    }

    public void setDeleteBy(Integer deleteBy) {
        this.deleteBy = deleteBy;
    }

    public LocalDateTime getDeleteAt() {
        return this.deleteAt;
    }

    public void setDeleteAt(LocalDateTime deleteAt) {
        this.deleteAt = deleteAt;
    }

    public Byte getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Staff (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(birthday);
        sb.append(", ").append(phone);
        sb.append(", ").append(gender);
        sb.append(", ").append(imgUrl);
        sb.append(", ").append(documentType);
        sb.append(", ").append(documentNumber);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(deleteBy);
        sb.append(", ").append(deleteAt);
        sb.append(", ").append(enabled);

        sb.append(")");
        return sb.toString();
    }
}
