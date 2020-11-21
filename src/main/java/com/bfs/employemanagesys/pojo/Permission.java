package com.bfs.employemanagesys.pojo;

import javax.persistence.*;

@Entity
@Table(name ="Permission", schema = "employee")
public class Permission {
    private Integer id;
    private String permissionName;
    private String permissionDescription;
    private String createDate;
    private String modificationDate;
    private String lastModificationUser;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PermissionName", nullable = false, length = 45)
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Basic
    @Column(name = "PermissionDescription", nullable = false, length = 45)
    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
    }

    @Basic
    @Column(name = "CreateDate", nullable = false, length = 45)
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "ModificationDate", nullable = false, length = 45)
    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Basic
    @Column(name = "LastModificationUser", nullable = false, length = 45)
    public String getLastModificationUser() {
        return lastModificationUser;
    }

    public void setLastModificationUser(String lastModificationUser) {
        this.lastModificationUser = lastModificationUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission that = (Permission) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (permissionName != null ? !permissionName.equals(that.permissionName) : that.permissionName != null)
            return false;
        if (permissionDescription != null ? !permissionDescription.equals(that.permissionDescription) : that.permissionDescription != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modificationDate != null ? !modificationDate.equals(that.modificationDate) : that.modificationDate != null)
            return false;
        if (lastModificationUser != null ? !lastModificationUser.equals(that.lastModificationUser) : that.lastModificationUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (permissionName != null ? permissionName.hashCode() : 0);
        result = 31 * result + (permissionDescription != null ? permissionDescription.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modificationDate != null ? modificationDate.hashCode() : 0);
        result = 31 * result + (lastModificationUser != null ? lastModificationUser.hashCode() : 0);
        return result;
    }
}
