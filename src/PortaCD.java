public class PortaCD {
    private CD[] dischi;
    private int num_max_cd;

    public PortaCD(int n) {
        dischi = new CD[n];
        num_max_cd = n;
    }

    public PortaCD(PortaCD cd) {
        this(cd.dischi.length);
        for (int i = 0; i < cd.dischi.length; i++) {
            if (cd.dischi[i] != null) {
                dischi[i]=new CD(cd.dischi[i]); //deep copy
                //setCD(cd.dischi[i], i); --> shallow copy
            }
        }
    }

    public int setCD(CD cd, int posizione) {
        int risult = -1;
        if (posizione >= 0 && posizione < num_max_cd && getCD(posizione) == null) {
            dischi[posizione] = new CD(cd);
            risult = posizione;
        } else if (getCD(posizione) != null) {
            risult = -2;
        }
        return risult;
    }

    public CD getCD(int posizione) {
        return dischi[posizione];
    }

    public int killCD(int posizione) {
        int risult = -1;
        if (posizione >= 0 && posizione < dischi.length && getCD(posizione) != null) {
            dischi[posizione] = null;
            risult = posizione;
        } else {
            risult = -2;
        }
        return risult;
    }

    public int getNumMaxDischi() {
        return num_max_cd;
    }

    public int getN() {
        int numero = 0;
        for (int i = 0; i < num_max_cd; i++) {
            if (dischi[i] != null) {
                numero++;
            }
        }
        return numero;
    }

    public int cercaCDPerTitolo(String titolo) {
        int risult = -1;
        int i = 0;
        while (i < num_max_cd && risult == -1) {
            if (dischi[i] != null && dischi[i].getTitolo().toLowerCase().contains(titolo.toLowerCase())) {
                risult = i;
            }
            i++;
        }
        return risult;
    }

    public int confrontaCollezione(PortaCD p) {
        int comune = 0;
        for (int i = 0; i < num_max_cd; i++) {
            for (int j = 0; j < p.num_max_cd; j++) {
                if (dischi[i]!=null &&  p.dischi[j]!=null && dischi[i].equals(p.dischi[j])) {
                    comune++;
                }
            }
        }
        return comune;
    }

    public String toString() {
        String risult = "Porta CD\n";
        for (int i = 0; i < num_max_cd; i++) {
            if (dischi[i] != null) {
                risult += " " + i + ". Titolo: " + dischi[i].getTitolo() + "; Autore: " + dischi[i].getAutore()
                        + "; Brani: " + dischi[i].getBrani() + "; Durata: " + dischi[i].getDurata() + "\n";
            } else {
                risult += " " + i + ". Elemento vuoto" + "\n";
            }
        }
        return risult;
    }

}
