package es.studium.davinciapp.ui.cientifico;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CientificoViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public CientificoViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Fue el inventor de los cortes anatómicos y de la representación de la figura humana en diferentes planos. " +
                "La raíz de sus trabajos anatómicos se sitúa en sus intereses artísticos por la exploración del cuerpo humano y" +
                " su funcionamiento; tenía como objetivo perfeccionar la representación de la figura humana.");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}