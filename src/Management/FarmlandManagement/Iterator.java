package Management.FarmlandManagement;

import Model.Farmland;

public interface Iterator {
    boolean hasNext();
    Farmland next();
    Farmland current();

}
