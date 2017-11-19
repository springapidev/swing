package com.coderbd.domain;
import java.sql.Blob;
/**
 *
 * @author Rajaul Islam
 */
public class TestImageDomainClass {

    private int id;
    private Blob blob;

    public TestImageDomainClass() {
    }

    public TestImageDomainClass(Blob blob) {
        this.blob = blob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getBlob() {
        return blob;
    }

    public void setBlob(Blob blob) {
        this.blob = blob;
    }

   
}
