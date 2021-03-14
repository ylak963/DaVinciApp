package es.studium.davinciapp.ui.pintor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PintorViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public PintorViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("La última cena de Da Vinci es un cuadro religioso pintado sobre la pared de una iglesia (fresco). " +
                " Pintado sobre gesso (mezcla de yeso y tiza) entre 1495 y 1497 en el convento Santa María de las Gracias, Milán, Italia.");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}