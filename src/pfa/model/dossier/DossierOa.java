package pfa.model.dossier;
// Generated 23 avr. 2016 02:24:37 by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import pfa.model.users.Utilisateur;




/**
 * DossierOa generated by hbm2java
 */
@Entity
@Table(name = "dossier_oa")
public class DossierOa  extends Dossier implements java.io.Serializable {

    //**************************************************************************************//       
    //**************************************************************************************//

    //**************************************************************************************//       
    //**************************************************************************************//
    public DossierOa() {
    }


    //**************************************************************************************//       
    //**************************************************************************************//



    public DossierOa(String dossier, Date dateEntree, Date dateSortie, String refAppro, String programmation, Date dateCreation, List<Note> notes, LettreAppro lettreAppro, Avis avis, Dpetl dpetl, Nature nature) {
        super(dossier, dateEntree, dateSortie, refAppro, programmation, dateCreation, notes, lettreAppro, avis, dpetl, nature);
    }

    public DossierOa(String dossier, Date dateEntree, String refAppro, String programmation, Date dateCreation, Avis avis, Dpetl dpetl, Nature nature) {
        super(dossier, dateEntree, refAppro, programmation, dateCreation, avis, dpetl, nature);
    }
    //**************************************************************************************//       
    //**************************************************************************************//


}


