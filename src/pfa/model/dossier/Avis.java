package pfa.model.dossier;
// Generated 23 avr. 2016 02:24:37 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.CascadeType;

/**
 * Avis generated by hbm2java
 */
@Entity
@Table(name = "avis")
public class Avis  implements java.io.Serializable {
    //**************************************************************************************//     
    //**************************************************************************************//  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avis")
     private Integer idAvis;
    @Column(length = 100,nullable = false)
     private String libele;
    @OneToMany(mappedBy = "avis")
    @Cascade(value = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.SAVE_UPDATE})
     private List<Dossier> dossiers = new ArrayList<Dossier>();
    //**************************************************************************************//     
    //**************************************************************************************//  

    public Avis(String libele) {
        this.libele = libele;
    }

    public Avis() {
    }

    public Avis(String libele,ArrayList<Dossier> dossiers ) {
        this.libele = libele;
        this.dossiers = dossiers;
    }

    //**************************************************************************************//     
    //**************************************************************************************// 
    public Integer getIdAvis() {
        return this.idAvis;
    }
    
    public void setIdAvis(Integer idAvis) {
        this.idAvis = idAvis;
    }
    public String getLibele() {
        return this.libele;
    }
    
    public void setLibele(String libele) {
        this.libele = libele;
    }
    public ArrayList<Dossier>  getDossiers() {
        return (ArrayList<Dossier>) this.dossiers;
    }
    
    public void setDossiers(List<Dossier>  dossiers) {
        this.dossiers = dossiers;
    }
    //**************************************************************************************//     
    //**************************************************************************************// 

    @Override
    public String toString() {
        return libele;
    }
    
}


