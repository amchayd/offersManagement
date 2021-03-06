package pfa.model.dossier;
// Generated 23 avr. 2016 02:24:37 by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import pfa.model.dossier.Avis;
import pfa.model.dossier.Dossier;
import pfa.model.dossier.Dpetl;
import pfa.model.dossier.LettreAppro;
import pfa.model.dossier.Nature;
import pfa.model.dossier.Note;
import pfa.model.users.Utilisateur;




/**
 * DossierCpsEtude generated by hbm2java
 */
@Entity
@Table(name = "dossier_cps")
public abstract class DossierCps extends Dossier implements java.io.Serializable {


    //**************************************************************************************//       
    //**************************************************************************************//
    public DossierCps() {
    }




    public DossierCps(String dossier, Date dateEntree, Date dateSortie, String refAppro, String programmation, Date dateCreation, List<Note> notes, LettreAppro lettreAppro, Avis avis, Dpetl dpetl, Nature nature) {
        super(dossier, dateEntree, dateSortie, refAppro, programmation, dateCreation, notes, lettreAppro, avis, dpetl, nature);
    }

    public DossierCps(String dossier, Date dateEntree, String refAppro, String programmation, Date dateCreation, Avis avis, Dpetl dpetl, Nature nature) {
        super(dossier, dateEntree, refAppro, programmation, dateCreation, avis, dpetl, nature);
    }

    //**************************************************************************************//       
    //**************************************************************************************//

    
    //**************************************************************************************//       
    //**************************************************************************************//

}


