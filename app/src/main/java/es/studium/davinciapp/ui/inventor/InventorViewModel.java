package es.studium.davinciapp.ui.inventor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventorViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public InventorViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Primer prototipo del helicóptero, este artilugio consta de una placa de base circular, con un eje atravesado " +
                "por un tornillo de unos 10 metros de diámetro. Leonardo se dio cuenta de que al girar el tornillo en un" +
                " fluido produciría un efecto de empuje que permitiría volar.");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}