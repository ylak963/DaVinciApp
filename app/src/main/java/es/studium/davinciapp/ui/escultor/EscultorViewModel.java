package es.studium.davinciapp.ui.escultor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EscultorViewModel extends ViewModel
{
    private MutableLiveData<String> mText;

    public EscultorViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Escultura de arcilla roja de 50 centímetros de altura, la Virgen María " +
                "mira al niño Jesús en su regazo con lo que puede ser el prototipo de todas las sonrisas enigmáticas en el arte de Leonardo");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}